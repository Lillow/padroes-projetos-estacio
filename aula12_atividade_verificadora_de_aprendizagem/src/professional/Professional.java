package professional;

public class Professional {
	private String name;
	private String profession;
	private double salary;

	public Professional(String name, String profession, double salary) {
		this.name = name;
		this.profession = profession;
		this.salary = salary;
	}

	public void trabalhar() {
		System.out.println(name + " é um " + profession + " e está trabalhando.");
	}

	public String getProfession() {
		return profession;
	}

	public double getSalary() {
		return salary;
	}
}