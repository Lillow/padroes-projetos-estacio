package factory;

import builder.BusBuilder;
import builder.VehicleBuilder;

//Fábrica concreta para ônibus
public class BusFactory implements VehicleFactory {
	@Override
	public VehicleBuilder createBuilder() {
		return new BusBuilder();
	}
}
