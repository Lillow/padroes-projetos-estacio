package builder;

import vehicle.Vehicle;

//Construtor concreto para carros
public class CarBuilder implements VehicleBuilder {
	private Vehicle car = new Vehicle("Carro");

	@Override
	public void buildEngine() {
		car.setEngine("Motor de Carro");
	}

	@Override
	public void buildWheels() {
		car.setWheels("Rodas de Carro");
	}

	@Override
	public void buildBody() {
		car.setBody("Carroceria de Carro");
	}

	@Override
	public Vehicle getResult() {
		return car;
	}
}
