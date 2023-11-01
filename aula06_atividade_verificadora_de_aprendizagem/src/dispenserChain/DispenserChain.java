package dispenserChain;

import dispenser.Dispenser;
import dispenser.Note10Dispenser;
import dispenser.Note1Dispenser;
import dispenser.Note2Dispenser;
import dispenser.Note5Dispenser;

public class DispenserChain {
	private Dispenser dispenserChain;

	public DispenserChain() {
		// Configurar a cadeia: R$10.00 -> R$5.00 -> R$2.00 -> R$1.00
		Dispenser note10Dispenser = new Note10Dispenser();
		Dispenser note5Dispenser = new Note5Dispenser();
		Dispenser note2Dispenser = new Note2Dispenser();
		Dispenser coin1Dispenser = new Note1Dispenser();

		note10Dispenser.setNextDispenser(note5Dispenser);
		note5Dispenser.setNextDispenser(note2Dispenser);
		note2Dispenser.setNextDispenser(coin1Dispenser);

		dispenserChain = note10Dispenser;
	}

	public void dispense(int amount) {
		if (amount <= 0) {
			System.out.println("Valor inválido.");
		} else {
			dispenserChain.dispense(amount);
		}
	}
}
