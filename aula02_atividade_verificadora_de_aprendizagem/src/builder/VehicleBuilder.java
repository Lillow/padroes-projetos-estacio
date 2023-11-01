package builder;

import vehicle.Vehicle;

//Interface para o construtor de veículos
public interface VehicleBuilder {
	void buildEngine();

	void buildWheels();

	void buildBody();

	Vehicle getResult();
}
