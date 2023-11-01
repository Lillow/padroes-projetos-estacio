package observer;

import trafficLightState.TrafficLight;

public class DriverBrake implements Observer {
	@Override
	public void update(TrafficLight trafficLight) {
		if (trafficLight.getCurrentColor().equals("Amarelo")) {
			System.out.println("Motorista freando");
		}
	}
}
