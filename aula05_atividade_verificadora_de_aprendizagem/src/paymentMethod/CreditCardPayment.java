package paymentMethod;

public class CreditCardPayment implements PaymentMethod {
	private String cardNumber;

	public CreditCardPayment(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public boolean pay(double amount) {
		// Implemente a lógica de pagamento com cartão de crédito aqui
		System.out.println("Pagamento de R$" + amount + " com cartão de crédito " + cardNumber);
		return true; // Simulando um pagamento bem-sucedido
	}
}
