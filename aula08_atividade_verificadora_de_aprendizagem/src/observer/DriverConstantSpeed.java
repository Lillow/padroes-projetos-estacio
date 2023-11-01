package observer;

import trafficLightState.TrafficLight;

public class DriverConstantSpeed implements Observer {
	@Override
	public void update(TrafficLight trafficLight) {
		if (trafficLight.getCurrentColor().equals("Vermelho")) {
			System.out.println("Motorista mantendo velocidade constante");
		}
	}
}