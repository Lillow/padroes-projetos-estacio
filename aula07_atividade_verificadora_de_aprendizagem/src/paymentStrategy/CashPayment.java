package paymentStrategy;

public class CashPayment implements PaymentStrategy {
	@Override
	public void pay(double amount) {
		System.out.println("Pagamento em dinheiro de R$" + amount);
	}
}
