package factory;

import builder.TruckBuilder;
import builder.VehicleBuilder;

//Fábrica concreta para caminhões
public class TruckFactory implements VehicleFactory {
	@Override
	public VehicleBuilder createBuilder() {
		return new TruckBuilder();
	}
}
