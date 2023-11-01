package main;

import order.Order;
import order.OrderItem;
import order.OrderMemento;
import paymentStrategy.CashPayment;
import paymentStrategy.CreditCardPayment;
import paymentStrategy.PayPalPayment;
import paymentStrategy.PaymentStrategy;

public class OrderApp {
	public static void main(String[] args) {
		PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
		PaymentStrategy payPalPayment = new PayPalPayment("user@example.com");
		PaymentStrategy cashPayment = new CashPayment();

		Order order = new Order();

		// Adicione itens ao pedido
		OrderItem item1 = new OrderItem("Produto 1", 50.0);
		OrderItem item2 = new OrderItem("Produto 2", 30.0);

		order.addOrderItem(item1);
		order.addOrderItem(item2);

		// Selecione uma estratégia de pagamento e faça o pagamento
		order.setPaymentStrategy(creditCardPayment);
		order.checkout();

		// Salve o estado atual do pedido
		OrderMemento memento = order.save();

		// Remova um item do pedido
		order.removeOrderItem(item2);

		// Desfazer a remoção do item
		order.restore(memento);

		// Selecione outra estratégia de pagamento e faça o pagamento novamente
		order.setPaymentStrategy(payPalPayment);
		order.checkout();

		// Faça um pagamento em dinheiro
		order.setPaymentStrategy(cashPayment);
		order.checkout();
	}
}