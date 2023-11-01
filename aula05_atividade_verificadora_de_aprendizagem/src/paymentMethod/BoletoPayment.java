package paymentMethod;

public class BoletoPayment implements PaymentMethod {
	private String boletoCode;

	public BoletoPayment(String boletoCode) {
		this.boletoCode = boletoCode;
	}

	@Override
	public boolean pay(double amount) {
		// Implemente a lógica de pagamento com boleto aqui
		System.out.println("Pagamento de R$" + amount + " com boleto " + boletoCode);
		return true; // Simulando um pagamento bem-sucedido
	}
}
