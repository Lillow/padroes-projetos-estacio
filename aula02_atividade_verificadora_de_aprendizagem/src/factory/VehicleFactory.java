package factory;

import builder.VehicleBuilder;

//Interface para a fábrica abstrata de veículos
public interface VehicleFactory {
	VehicleBuilder createBuilder();
}
