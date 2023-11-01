package product;

import java.util.List;

public class ProductController {
	private ProductService productService;
	private ProductView productView;

	public ProductController(ProductService productService, ProductView productView) {
		this.productService = productService;
		this.productView = productView;
	}

	public void displayProductList() {
		List<Product> products = productService.getAllProducts();
		productView.showProductList(products);
	}

	public void addProduct() {
		Product newProduct = productView.getInputForNewProduct();
		productService.addProduct(newProduct);
		productView.displaySuccessMessage("Produto adicionado com sucesso.");
	}

	public void updateProduct() {
		int productId = productView.getInputForProductId();
		Product updatedProduct = productView.getInputForUpdatedProduct();
		updatedProduct.setId(productId);
		productService.updateProduct(updatedProduct);
		productView.displaySuccessMessage("Produto atualizado com sucesso.");
	}

	public void deleteProduct() {
		int productId = productView.getInputForProductId();
		productService.deleteProduct(productId);
		productView.displaySuccessMessage("Produto excluído com sucesso.");
	}
}