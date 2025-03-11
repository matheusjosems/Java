package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorExDolar;

public class ExerciciosMembrosStaticos {
	public static void main (String[]arg) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Whats is the dollar price ?");
		double D = sc.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		double M = sc.nextDouble();
		
		double result = CalculatorExDolar.Z(M,D);
		System.out.printf("Amount to be paid in reais = %.2f%n", result );
		
		sc.close();
	}
	
}
