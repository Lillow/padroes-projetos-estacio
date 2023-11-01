package dispenser;

public class Note1Dispenser implements Dispenser {
	private Dispenser nextDispenser;

	@Override
	public void setNextDispenser(Dispenser nextDispenser) {
		this.nextDispenser = nextDispenser;
	}

	@Override
	public void dispense(int amount) {
		if (amount >= 1) {
			int numNotes = amount / 1;
			int remainder = amount % 1;
			System.out.println("Entregando " + numNotes + " nota(s) de R$1.00");
			if (remainder > 0 && nextDispenser != null) {
				nextDispenser.dispense(remainder);
			}
		} else if (nextDispenser != null) {
			nextDispenser.dispense(amount);
		}
	}
}
