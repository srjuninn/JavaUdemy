package exercicioRetangulo;

import java.util.Scanner;

public class MainRetangulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Retangulo retangulo = new Retangulo();

		System.out.println("Enter rectangle width and height:");

		retangulo.width = sc.nextDouble();

		retangulo.height = sc.nextDouble();

		System.out.printf("AREA = %.2f%nPerimeter = %.2f%nDiagonal = %.2f", retangulo.area(),

				retangulo.perimetro(), retangulo.diagonal());

		sc.close();

	}

}