package exercicioEstudante;

import java.util.Scanner;

public class EstudanteMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Estudante estu = new Estudante();
		
		System.out.println("Insira o nome do aluno");
		estu.name = sc.nextLine();
		System.out.println("Insira a nota 1 do aluno (0-30)");
		estu.notas[0] = sc.nextDouble();
		System.out.println("Insira a nota 2 do aluno (0-35)");
		estu.notas[1] = sc.nextDouble();
		System.out.println("Insira a nota 3 do aluno (0-35)");
		estu.notas[2] = sc.nextDouble();
		
		System.out.printf(estu.PassOrFailed());
		
		sc.close();
	}

}
