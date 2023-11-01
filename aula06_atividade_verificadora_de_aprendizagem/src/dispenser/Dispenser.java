package dispenser;

public interface Dispenser {
	void setNextDispenser(Dispenser nextDispenser);

	void dispense(int amount);
}
