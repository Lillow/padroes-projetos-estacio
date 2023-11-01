package observer;

import trafficLightState.TrafficLight;

public class DriverAccelerate implements Observer {
	@Override
	public void update(TrafficLight trafficLight) {
		if (trafficLight.getCurrentColor().equals("Verde")) {
			System.out.println("Motorista acelerando");
		}
	}
}
