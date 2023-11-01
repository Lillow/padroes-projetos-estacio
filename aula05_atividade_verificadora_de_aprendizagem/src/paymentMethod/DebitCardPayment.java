package paymentMethod;

public class DebitCardPayment implements PaymentMethod {
	private String cardNumber;

	public DebitCardPayment(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public boolean pay(double amount) {
		// Implemente a lógica de pagamento com cartão de débito aqui
		System.out.println("Pagamento de R$" + amount + " com cartão de débito " + cardNumber);
		return true; // Simulando um pagamento bem-sucedido
	}
}
