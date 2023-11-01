package builder;

import vehicle.Vehicle;

//Construtor concreto para caminhões
public class TruckBuilder implements VehicleBuilder {
	private Vehicle truck = new Vehicle("Caminhão");

	@Override
	public void buildEngine() {
		truck.setEngine("Motor de Caminhão");
	}

	@Override
	public void buildWheels() {
		truck.setWheels("Rodas de Caminhão");
	}

	@Override
	public void buildBody() {
		truck.setBody("Carroceria de Caminhão");
	}

	@Override
	public Vehicle getResult() {
		return truck;
	}
}
