package shoppingFacade;

import paymentMethod.PaymentMethod;
import product.Product;
import shoppingCart.ShoppingCart;

public class ShoppingFacade {
	private ShoppingCart shoppingCart = new ShoppingCart();

	public void addProductToCart(Product product) {
		shoppingCart.addProduct(product);
	}

	public void selectPaymentMethod(PaymentMethod paymentMethod) {
		shoppingCart.setPaymentMethod(paymentMethod);
	}

	public boolean checkout() {
		return shoppingCart.checkout();
	}
}
