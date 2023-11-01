package main;

import paymentMethod.BoletoPayment;
import paymentMethod.CreditCardPayment;
import paymentMethod.DebitCardPayment;
import paymentMethod.PaymentMethod;
import product.Product;
import shoppingFacade.ShoppingFacade;

public class ShoppingApp {
	public static void main(String[] args) {
		// Crie produtos
		Product product1 = new Product("Produto 1", 50.0);
		Product product2 = new Product("Produto 2", 30.0);

		// Crie métodos de pagamento
		PaymentMethod creditCard = new CreditCardPayment("1234-5678-9012-3456");
		PaymentMethod debitCard = new DebitCardPayment("9876-5432-1098-7654");
		PaymentMethod boleto = new BoletoPayment("1234567890");

		// Crie uma fachada de compras
		ShoppingFacade shoppingFacade = new ShoppingFacade();

		// Adicione produtos ao carrinho
		shoppingFacade.addProductToCart(product1);
		shoppingFacade.addProductToCart(product2);

		// Selecione um método de pagamento e faça o checkout
		shoppingFacade.selectPaymentMethod(creditCard);
		shoppingFacade.checkout();

		// Alterne para outro método de pagamento e faça o checkout novamente
		shoppingFacade.selectPaymentMethod(debitCard);
		shoppingFacade.checkout();

		// Pague com boleto
		shoppingFacade.selectPaymentMethod(boleto);
		shoppingFacade.checkout();
	}
}
