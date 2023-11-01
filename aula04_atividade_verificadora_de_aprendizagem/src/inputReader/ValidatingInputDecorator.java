package inputReader;

public class ValidatingInputDecorator implements InputReader {
	private InputReader reader;

	public ValidatingInputDecorator(InputReader reader) {
		this.reader = reader;
	}

	@Override
	public String readInput() {
		String input;
		do {
			input = reader.readInput();
		} while (!isValidInput(input));
		return input;
	}

	private boolean isValidInput(String input) {
		// Adicione validações de entrada aqui, por exemplo, para garantir que a entrada
		// seja válida para sua calculadora.
		return true;
	}
}