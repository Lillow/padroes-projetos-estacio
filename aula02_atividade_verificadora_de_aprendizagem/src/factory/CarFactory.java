package factory;

import builder.CarBuilder;
import builder.VehicleBuilder;

//Fábrica concreta para carros
public class CarFactory implements VehicleFactory {
	@Override
	public VehicleBuilder createBuilder() {
		return new CarBuilder();
	}
}