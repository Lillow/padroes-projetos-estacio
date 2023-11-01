package dispenser;

public class Note10Dispenser implements Dispenser {
	private Dispenser nextDispenser;

	@Override
	public void setNextDispenser(Dispenser nextDispenser) {
		this.nextDispenser = nextDispenser;
	}

	@Override
	public void dispense(int amount) {
		if (amount >= 10) {
			int numNotes = amount / 10;
			int remainder = amount % 10;
			System.out.println("Entregando " + numNotes + " nota(s) de R$10.00");
			if (remainder > 0 && nextDispenser != null) {
				nextDispenser.dispense(remainder);
			}
		} else if (nextDispenser != null) {
			nextDispenser.dispense(amount);
		}
	}
}
