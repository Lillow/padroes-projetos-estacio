package dispenser;

public class Note5Dispenser implements Dispenser {
	private Dispenser nextDispenser;

	@Override
	public void setNextDispenser(Dispenser nextDispenser) {
		this.nextDispenser = nextDispenser;
	}

	@Override
	public void dispense(int amount) {
		if (amount >= 5) {
			int numNotes = amount / 5;
			int remainder = amount % 5;
			System.out.println("Entregando " + numNotes + " nota(s) de R$5.00");
			if (remainder > 0 && nextDispenser != null) {
				nextDispenser.dispense(remainder);
			}
		} else if (nextDispenser != null) {
			nextDispenser.dispense(amount);
		}
	}
}
