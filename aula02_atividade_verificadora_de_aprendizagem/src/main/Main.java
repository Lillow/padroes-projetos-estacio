package main;

import builder.VehicleBuilder;
import factory.BusFactory;
import factory.CarFactory;
import factory.TruckFactory;
import factory.VehicleFactory;
import vehicle.Vehicle;

public class Main {
	public static void main(String[] args) {
		// Criar uma fábrica de carros
		VehicleFactory carFactory = new CarFactory();

		// Criar um construtor de carros
		VehicleBuilder carBuilder = carFactory.createBuilder();

		// Construir um carro
		carBuilder.buildEngine();
		carBuilder.buildWheels();
		carBuilder.buildBody();
		Vehicle car = carBuilder.getResult();

		// Exibir as informações do carro
		System.out.println("Carro:\n" + car);

		// Repetir o processo para ônibus e caminhões
		VehicleFactory busFactory = new BusFactory();
		VehicleBuilder busBuilder = busFactory.createBuilder();
		busBuilder.buildEngine();
		busBuilder.buildWheels();
		busBuilder.buildBody();
		Vehicle bus = busBuilder.getResult();
		System.out.println("\nÔnibus:\n" + bus);

		VehicleFactory truckFactory = new TruckFactory();
		VehicleBuilder truckBuilder = truckFactory.createBuilder();
		truckBuilder.buildEngine();
		truckBuilder.buildWheels();
		truckBuilder.buildBody();
		Vehicle truck = truckBuilder.getResult();
		System.out.println("\nCaminhão:\n" + truck);
	}
}
