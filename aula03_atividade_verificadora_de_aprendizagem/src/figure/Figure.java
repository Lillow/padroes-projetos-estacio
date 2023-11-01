package figure;

//Classe abstrata para representar uma figura
public abstract class Figure {
	private String color;

	public Figure(String color) {
		this.color = color;
	}

	public abstract void draw();

	public String getColor() {
		return color;
	}

	@Override
	public Figure clone() throws CloneNotSupportedException {
		return (Figure) super.clone();
	}
}
