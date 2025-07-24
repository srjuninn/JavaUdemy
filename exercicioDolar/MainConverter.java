package exercicioDolar;

import java.util.Scanner;

public class MainConverter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double dollarPrice, dollarQuantity, amountPaid;
		
		System.out.print("What is the dollar price ? ");
		dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		dollarQuantity = sc.nextDouble();
		amountPaid = CurrencyConverter.converterDolar(dollarQuantity, dollarPrice);
		System.out.printf("Amount to be paid in reais: %.2f%n", amountPaid);
		
		
		sc.close();
	}

}
