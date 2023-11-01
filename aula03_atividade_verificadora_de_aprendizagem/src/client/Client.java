package client;

import figure.*;

//Cliente que utiliza os padrões
public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		FigureManager manager = FigureManager.getInstance();

		String blue = "Azul";
		String red = "Vermelho";

		Figure blueCircle = new Circle(blue);
		Figure redSquare = new Square(red);

		manager.addFigure(blueCircle);
		manager.addFigure(redSquare);

		// Clonar o círculo e alterar sua cor
		Figure greenCircle = new Circle(red);
		manager.addFigure(greenCircle);

		manager.drawAll();
	}
}
