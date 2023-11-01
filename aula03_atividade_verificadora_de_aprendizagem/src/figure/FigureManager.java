package figure;

import java.util.ArrayList;
import java.util.List;

//Classe Singleton para gerenciar a lista de figuras
public class FigureManager {
	private static FigureManager instance;
	private List<Figure> figures = new ArrayList<>();

	private FigureManager() {
	}

	public static FigureManager getInstance() {
		if (instance == null) {
			instance = new FigureManager();
		}
		return instance;
	}

	public void addFigure(Figure figure) {
		figures.add(figure);
	}

	public void drawAll() {
		for (Figure figure : figures) {
			figure.draw();
		}
	}
}
