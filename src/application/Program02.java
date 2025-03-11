package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program02 {
	// exercicio 01 

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("enter rectangle width an heidght: ");
		retangulo.Width = sc.nextDouble();
		retangulo.Heidght = sc.nextDouble();
		
		
		double Area = retangulo.Area();
		double Perimeter = retangulo.Perimeter();
		double Diagonal = retangulo.Diagonal();
		
		
		System.out.println("AREA = " + Area);
		
		//retangulo.Perimeter = sc.nextDouble();
		System.out.println("PERIMETER = " + Perimeter);
		
		//retangulo.Diagonal = sc.nextDouble();
		System.out.println("DIAGONAL = " + Diagonal);
		
		
		
		sc.close();
		
	}

}
