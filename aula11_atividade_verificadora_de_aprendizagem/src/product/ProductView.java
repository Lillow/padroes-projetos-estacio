package product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
	private Scanner scanner = new Scanner(System.in);

	public void showProductList(List<Product> products) {
		System.out.println("Lista de Produtos:");
		for (Product product : products) {
			System.out.println(
					"ID: " + product.getId() + " | Nome: " + product.getName() + " | Preço: " + product.getPrice());
		}
	}

	public Product getInputForNewProduct() {
		System.out.print("Nome do Produto: ");
		String name = scanner.nextLine();
		System.out.print("Preço do Produto: ");
		double price = scanner.nextDouble();
		return new Product(0, name, price);
	}

	public int getInputForProductId() {
		System.out.print("ID do Produto: ");
		return scanner.nextInt();
	}

	public Product getInputForUpdatedProduct() {
		System.out.print("Novo Nome do Produto: ");
		String name = scanner.nextLine();
		System.out.print("Novo Preço do Produto: ");
		double price = scanner.nextDouble();
		return new Product(0, name, price);
	}

	public void displaySuccessMessage(String message) {
		System.out.println("Sucesso: " + message);
	}
}
