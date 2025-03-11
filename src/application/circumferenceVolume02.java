package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class circumferenceVolume02 {
	
	public static void main (String[] args) {
		
		//Calculator calc = new Calculator (); usar so quando nao tiver membros estaticos ao invez de usar Calculator. usassse calc 
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner (System.in);
		
		System.out.print("Enter radios: ");
		double radios = sc.nextDouble();
		
		double c = Calculator.circumference(radios);
		
		double v = Calculator.volume(radios);
		
		System.out.printf("Circumference: %.2%fn", c );
		System.out.printf("Volume: %.2%fn", v );
		System.out.printf("PI value: %.2%fn", Calculator.PI );
		
		sc.close();
	}
}
