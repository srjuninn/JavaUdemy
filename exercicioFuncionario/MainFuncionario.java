package exercicioFuncionario;

import java.util.Scanner;

public class MainFuncionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario func = new Funcionario();
		double percentage;
		
		System.out.print("Nome: ");
		func.name = sc.nextLine();
		System.out.print("Gross salary: ");
		func.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		func.tax = sc.nextDouble();
		System.out.printf("Employee: %s, $ %.2f%n", func.name, func.NetSalary());
		
		System.out.print("Which percentage to increase salary ? ");
		percentage = sc.nextDouble();
		func.increaseSalary(1 + percentage / 100);
		
		System.out.printf("Updated: %s, $ %.2f%n", func.name, func.NetSalary());
		sc.close();
	}

}
