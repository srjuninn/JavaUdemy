package exercicioFuncionario;

public class Funcionario {
	public String name;
	public double grossSalary;
	public double tax;

	public double NetSalary() {
		return this.grossSalary - this.tax;
	}
	public void increaseSalary(double increase) {
		this.grossSalary *= increase;
	}
}