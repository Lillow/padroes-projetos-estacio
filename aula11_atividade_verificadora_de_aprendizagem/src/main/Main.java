package main;

import java.util.Scanner;

import product.ProductController;
import product.ProductService;
import product.ProductView;

public class Main {
	public static void main(String[] args) {
		ProductService productService = new ProductService();
		ProductView productView = new ProductView();
		ProductController productController = new ProductController(productService, productView);

		// Exemplo de uso do controlador
		while (true) {
			System.out.println("\nEscolha uma opção:");
			System.out.println("1. Listar Produtos");
			System.out.println("2. Adicionar Produto");
			System.out.println("3. Atualizar Produto");
			System.out.println("4. Excluir Produto");
			System.out.println("5. Sair");
			System.out.print("Opção: ");

			
			Scanner scanner = new Scanner(System.in);
			int option = scanner.nextInt();
			scanner.close();
			

			switch (option) {
			case 1:
				productController.displayProductList();
				break;
			case 2:
				productController.addProduct();
				break;
			case 3:
				productController.updateProduct();
				break;
			case 4:
				productController.deleteProduct();
				break;
			case 5:
				System.out.println("Saindo do programa.");
				productService.close();
				System.exit(0);
			default:
				System.out.println("Opção inválida.");
			}
		}
	}
}