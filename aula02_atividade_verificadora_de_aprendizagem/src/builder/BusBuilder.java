package builder;

import vehicle.Vehicle;

//Construtor concreto para ônibus
public class BusBuilder implements VehicleBuilder {
	private Vehicle bus = new Vehicle("Ônibus");

	@Override
	public void buildEngine() {
		bus.setEngine("Motor de Ônibus");
	}

	@Override
	public void buildWheels() {
		bus.setWheels("Rodas de Ônibus");
	}

	@Override
	public void buildBody() {
		bus.setBody("Carroceria de Ônibus");
	}

	@Override
	public Vehicle getResult() {
		return bus;
	}
}
