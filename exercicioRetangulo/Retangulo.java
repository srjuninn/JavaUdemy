package exercicioRetangulo;

public class Retangulo {

	public double width;

	public double height;

	public double area() {

		return this.width * this.height;

	}

	public double perimetro() {

		return 2 * (this.width + this.height);

	}

	public double diagonal() {

		return Math.sqrt((Math.pow(this.width, 2) + Math.pow(this.height, 2)));

	}

}