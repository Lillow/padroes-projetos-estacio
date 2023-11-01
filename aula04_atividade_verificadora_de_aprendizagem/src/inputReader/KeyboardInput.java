package inputReader;

import java.util.Scanner;

public class KeyboardInput implements InputReader {
	private Scanner scanner = new Scanner(System.in);

	@Override
	public String readInput() {
		System.out.print("Digite uma expressão (por exemplo, 10 + 5): ");
		return scanner.nextLine();
	}
}
