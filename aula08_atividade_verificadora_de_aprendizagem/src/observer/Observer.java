package observer;

import trafficLightState.TrafficLight;

public interface Observer {
	void update(TrafficLight trafficLight);
}
