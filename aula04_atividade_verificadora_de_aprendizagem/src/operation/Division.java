package operation;

public class Division implements Operation {
	@Override
	public double calculate(double num1, double num2) {
		if (num2 == 0) {
			throw new IllegalArgumentException("Divisão por zero não é permitida.");
		}
		return num1 / num2;
	}
}
