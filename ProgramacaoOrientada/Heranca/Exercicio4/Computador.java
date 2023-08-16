package Exercicio4;

public class Computador {
	protected String Marca;
	private String Modelo;
	
	public Computador(String marca, String modelo) {
		super();
		this.Marca = marca;
		this.Modelo = modelo;
	}
	
	
	
	public String getMarca() {
		return Marca;
	}



	public void setMarca(String marca) {
		Marca = marca;
	}



	public String getModelo() {
		return Modelo;
	}



	public void setModelo(String modelo) {
		Modelo = modelo;
	}



	public String exibeModelo() {
		return this.Modelo;
	}
}

	