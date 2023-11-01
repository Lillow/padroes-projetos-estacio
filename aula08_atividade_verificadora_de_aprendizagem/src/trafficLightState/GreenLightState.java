package trafficLightState;

public class GreenLightState implements TrafficLightState {
	@Override
	public void handle(TrafficLight trafficLight) {
		System.out.println("Semáforo verde - Prossiga com cuidado");
	}

	@Override
	public String getColor() {
		return "Verde";
	}
}
