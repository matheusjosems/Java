package application;

import java.util.Locale;
import java.util.Scanner;

public class circumferenceVolume01 {
	public static final  double PI = 3.14159;
	
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner (System.in);
		
		System.out.print("Enter radios: ");
		double radios = sc.nextDouble();
		
		double c = circumference(radios);
		
		double v = volume(radios);
		
		System.out.printf("Circumference: %.2%fn", c );
		System.out.printf("Volume: %.2%fn", v );
		System.out.printf("PI value: %.2%fn", PI );
		
		sc.close();
	}
	
	public static double circumference (double radios) {
		return 2.0 * PI * radios;
	}
	
	public static double volume (double radios) {
		return 4.0 * PI * radios * radios / 3.0;
	}
	
}
