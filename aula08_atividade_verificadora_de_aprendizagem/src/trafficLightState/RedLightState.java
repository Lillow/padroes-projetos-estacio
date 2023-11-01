package trafficLightState;

public class RedLightState implements TrafficLightState {
	@Override
	public void handle(TrafficLight trafficLight) {
		System.out.println("Semáforo vermelho - Pare");
	}

	@Override
	public String getColor() {
		return "Vermelho";
	}
}
