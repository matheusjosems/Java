package util;

public class CalculatorExDolar {

	public static double IDF = 0.06;
	
	public static double Z (double M, double D ) {
		return M * D * (1.0 + IDF);
	}
	
}
