package util;

public class Calculator {
	public static final double PI = 3.14159;
	
	public static double circumference (double radius) { //public double , nao é estatico,  
		return 2.0 * PI * radius;
	}
	
	public static double volume (double radius) {
		return 4.0 * PI * radius * radius / 3.0;
	}
	
}
