package entities;

public class Retangulo {
	
	public double Width;
	public double Heidght;
	
	public double Area () {
		
		return Width*Heidght ;
	}
	
	public double Perimeter() {
		return 2*(Width + Heidght);
	}
	
	public double Diagonal() {
		double a = Math.pow(Width,2);
		double b = Math.pow(Heidght,2);
		double diagonal = Math.sqrt(a+b);
		return diagonal; 
		
	}

}
