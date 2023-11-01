package trafficLightState;

public interface TrafficLightState {
	void handle(TrafficLight trafficLight);

	String getColor();
}
