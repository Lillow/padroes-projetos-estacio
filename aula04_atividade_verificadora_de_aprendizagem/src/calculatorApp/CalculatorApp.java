package calculatorApp;

import operation.*;
import calculator.*;
import inputReader.*;

public class CalculatorApp {
	public static void main(String[] args) {
		InputReader inputReader = new KeyboardInput();
		InputReader validatingReader = new ValidatingInputDecorator(inputReader);
		Calculator calculator;

		System.out.println("Bem-vindo à calculadora simples!");

		while (true) {
			String input = validatingReader.readInput();
			String[] parts = input.split(" ");

			if (parts.length != 3) {
				System.out.println("Entrada inválida. Por favor, tente novamente.");
				continue;
			}

			double num1 = Double.parseDouble(parts[0]);
			double num2 = Double.parseDouble(parts[2]);

			switch (parts[1]) {
			case "+":
				calculator = new BasicCalculator(new Addition());
				break;
			case "-":
				calculator = new BasicCalculator(new Subtraction());
				break;
			case "*":
				calculator = new BasicCalculator(new Multiplication());
				break;
			case "/":
				calculator = new BasicCalculator(new Division());
				break;
			default:
				System.out.println("Operação não suportada. Por favor, tente novamente.");
				continue;
			}

			double result = calculator.executeOperation(num1, num2);
			System.out.println("Resultado: " + result);
		}
	}
}
