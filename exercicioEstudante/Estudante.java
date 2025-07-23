package exercicioEstudante;

public class Estudante {

	public String name;
	double notas[] = new double[3];

	public double SomarNotas() {
		return notas[0] + notas[1] + notas[2];
	}

	public String PassOrFailed() {
		double soma = SomarNotas();
		if (soma >= 60) {
			return String.format("FINAL GRADE: %.2f%nPASS", soma);
		} else {
			double missing = 60 - soma;
			return String.format("FINAL GRADE: %.2f%nFAILED%nMISSING: %.2f POINTS%n", soma, missing);
		}
	}
}
