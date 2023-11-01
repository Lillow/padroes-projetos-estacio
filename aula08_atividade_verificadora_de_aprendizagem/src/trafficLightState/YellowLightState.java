package trafficLightState;

public class YellowLightState implements TrafficLightState {
	@Override
	public void handle(TrafficLight trafficLight) {
		System.out.println("Semáforo amarelo - Reduza a velocidade");
	}

	@Override
	public String getColor() {
		return "Amarelo";
	}
}
