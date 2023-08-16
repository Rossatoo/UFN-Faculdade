package Locadora;

public class Carro {
	public String marca;
	public String modelo;
	
	
	//metodo com passagem de parametros
	public void atribuirValores(String marcaC, String modeloC) {
		marca = marcaC;
		modelo = modeloC;
	}
	public String exibirMarca(){
		return marca;
	}
	public String exibirModelo() {
		return modelo;
	}
	
	
	/*Metodo construtor
	public Carro(String modeloCarro, String marcaCarro) {
		modelo = modeloCarro;
		marca = marcaCarro;
	}
	
	public void exibirDados() {
		System.out.println("Carro: "+marca+"\nModelo: "+modelo);
	}*/
}

