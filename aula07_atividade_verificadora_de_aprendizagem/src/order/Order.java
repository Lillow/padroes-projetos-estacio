package order;

import java.util.ArrayList;
import java.util.List;

import paymentStrategy.PaymentStrategy;

public class Order {
	private List<OrderItem> items = new ArrayList<>();
	private PaymentStrategy paymentStrategy;

	public void addOrderItem(OrderItem item) {
		items.add(item);
	}

	public void removeOrderItem(OrderItem item) {
		items.remove(item);
	}

	public double getTotalAmount() {
		double total = 0;
		for (OrderItem item : items) {
			total += item.getPrice();
		}
		return total;
	}

	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}

	public void checkout() {
		double totalAmount = getTotalAmount();
		paymentStrategy.pay(totalAmount);
	}

	// Implemente o padrão Memento para permitir desfazer adições/remoções de itens
	public OrderMemento save() {
		return new OrderMemento(new ArrayList<>(items));
	}

	public void restore(OrderMemento memento) {
		items = new ArrayList<>(memento.getItems());
	}
}
