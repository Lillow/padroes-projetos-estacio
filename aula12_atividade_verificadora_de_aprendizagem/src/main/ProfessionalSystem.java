package main;

import professional.IncomeTaxService;
import professional.Professional;

public class ProfessionalSystem {
	public static void main(String[] args) {
		Professional engineer = new Professional("John", "Engenheiro", 5000);
		Professional lawyer = new Professional("Alice", "Advogado", 6000);
		Professional doctor = new Professional("Mike", "Médico", 7000);

		engineer.trabalhar();
		IncomeTaxService taxService = new IncomeTaxService();
		double tax = taxService.calculateIncomeTax(engineer);
		System.out.println("Imposto de Renda descontado: $" + tax);

		lawyer.trabalhar();
		tax = taxService.calculateIncomeTax(lawyer);
		System.out.println("Imposto de Renda descontado: $" + tax);

		doctor.trabalhar();
		tax = taxService.calculateIncomeTax(doctor);
		System.out.println("Imposto de Renda descontado: $" + tax);
	}
}
