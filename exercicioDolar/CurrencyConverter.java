package exercicioDolar;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double converterDolar(double dolarQuantity, double dolarPrice) {
		 return dolarPrice * dolarQuantity * (1 + IOF);
	}
	
}
