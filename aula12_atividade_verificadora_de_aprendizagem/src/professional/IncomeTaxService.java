package professional;

public class IncomeTaxService {
	public double calculateIncomeTax(Professional professional) {
		double salary = professional.getSalary();
		double taxRate = getTaxRate(professional.getProfession());
		return salary * taxRate;
	}

	private double getTaxRate(String profession) {
		switch (profession.toLowerCase()) {
		case "engenheiro":
			return 0.15;
		case "advogado":
			return 0.18;
		case "médico":
			return 0.20;
		default:
			return 0.10; // Imposto padrão para outras profissões
		}
	}
}