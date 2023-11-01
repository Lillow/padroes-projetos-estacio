package figure;

//Classe concreta para representar um quadrado
public class Square extends Figure {
	public Square(String color) {
		super(color);
	}

	@Override
	public void draw() {
		System.out.println("Desenhando um quadrado de cor " + getColor());
	}
}
