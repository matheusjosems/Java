package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity; 
	 
	public double totalValueInStock() {
		return price * quantity;
		
	}
	
	public void addProducts(int quantity ) { //  quando esta entre () altera o valor de uma do atributo da classe o quantity sao diferentes  
		this.quantity += quantity; // this acessa o atributo da classe e nao o parametro que esta em () "this."
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity; 
	}
	
	public String toString() {
		return name
				+ ",$ "
				+ String.format("%.2f", price)
				+", "
				+ quantity 
				+ "units, total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}
