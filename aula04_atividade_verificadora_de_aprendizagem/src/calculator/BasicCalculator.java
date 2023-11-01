package calculator;

import operation.Operation;

public class BasicCalculator implements Calculator {
	private Operation operation;

	public BasicCalculator(Operation operation) {
		this.operation = operation;
	}

	@Override
	public double executeOperation(double num1, double num2) {
		return operation.calculate(num1, num2);
	}
}
