package dispenser;

public class Note2Dispenser implements Dispenser {
	private Dispenser nextDispenser;

	@Override
	public void setNextDispenser(Dispenser nextDispenser) {
		this.nextDispenser = nextDispenser;
	}

	@Override
	public void dispense(int amount) {
		if (amount >= 2) {
			int numNotes = amount / 2;
			int remainder = amount % 2;
			System.out.println("Entregando " + numNotes + " nota(s) de R$2.00");
			if (remainder > 0 && nextDispenser != null) {
				nextDispenser.dispense(remainder);
			}
		} else if (nextDispenser != null) {
			nextDispenser.dispense(amount);
		}
	}
}
