package POO;

public class Seguro {
	 private String carro;
	 private String cliente; 
	 private double valor;
	 private boolean vigência;
	 
	 public Seguro (String carro, String cliente, double valor, boolean vigência) {
		 this.carro = carro;
		 this.cliente = cliente;
		 this.valor = valor;
		 this.vigência = vigência;
	 }

	public String getCarro() {
		return carro;
	}

	public void setCarro(String carro) {
		this.carro = carro;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean getVigência() {
		return vigência;
	}

	public void setVigência(boolean vigência) {
		this.vigência = vigência;
	}

}
