package shoppingCart;

import java.util.ArrayList;
import java.util.List;

import paymentMethod.PaymentMethod;
import product.Product;

public class ShoppingCart {
	private List<Product> products = new ArrayList<>();
	private PaymentMethod paymentMethod;

	public void addProduct(Product product) {
		products.add(product);
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public boolean checkout() {
		double totalAmount = calculateTotalAmount();
		if (paymentMethod != null) {
			return paymentMethod.pay(totalAmount);
		} else {
			System.out.println("Selecione um método de pagamento antes de fazer o checkout.");
			return false;
		}
	}

	private double calculateTotalAmount() {
		double total = 0;
		for (Product product : products) {
			total += product.getPrice();
		}
		return total;
	}
}
