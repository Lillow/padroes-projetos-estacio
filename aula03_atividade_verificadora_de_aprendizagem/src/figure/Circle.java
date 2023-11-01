package figure;

//Classe concreta para representar um círculo
public class Circle extends Figure {
	public Circle(String color) {
		super(color);
	}

	@Override
	public void draw() {
		System.out.println("Desenhando um círculo de cor " + getColor());
	}
}
