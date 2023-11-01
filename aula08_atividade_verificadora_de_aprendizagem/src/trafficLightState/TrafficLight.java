package trafficLightState;

import java.util.ArrayList;
import java.util.List;
import observer.Observer;

public class TrafficLight {
	private TrafficLightState currentState;

	public TrafficLight() {
		currentState = new RedLightState();
	}

	public void setState(TrafficLightState state) {
		currentState = state;
	}

	public void change() {
		if (currentState instanceof RedLightState) {
			setState(new GreenLightState());
		} else if (currentState instanceof GreenLightState) {
			setState(new YellowLightState());
		} else if (currentState instanceof YellowLightState) {
			setState(new RedLightState());
		}
		notifyObservers();
	}

	public String getCurrentColor() {
		return currentState.getColor();
	}

	// Implemente o padrão Observer
	private List<Observer> observers = new ArrayList<>();

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}
}
