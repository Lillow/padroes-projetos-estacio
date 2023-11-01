package main;

import observer.DriverAccelerate;
import observer.DriverBrake;
import observer.DriverConstantSpeed;
import trafficLightState.TrafficLight;

public class TrafficSystemApp {
	public static void main(String[] args) {
		TrafficLight trafficLight = new TrafficLight();
		trafficLight.addObserver(new DriverAccelerate());
		trafficLight.addObserver(new DriverBrake());
		trafficLight.addObserver(new DriverConstantSpeed());

		trafficLight.change(); // Verde
		trafficLight.change(); // Amarelo
		trafficLight.change(); // Vermelho
		trafficLight.change(); // Verde
	}
}
