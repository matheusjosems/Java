package entities;

public class Triangle { // classe personalizada, clase é a definiçao de um tipo
	                    // nesse caso define o que e um trianagulo, ou seja, algo que contem tres 
						// varaveis,  objetos sao instancias da classe 
						// nesse caso o x e y sao objetos que sao triangulos a classe é o que define um objeto e suas caracteristicas 
	public double a; // public indica que essa funçao pode se rusada em outro arquivo
	public double b;
	public double c;
	
	public double area() {
		double p = (a + b + c)/ 2.0;
		double result = Math.sqrt(p * (p - a)* (p - b) * (p - c));
		return result; // posso aparagr o return result e substituir por: return (calculo) 
	}
	
} 
