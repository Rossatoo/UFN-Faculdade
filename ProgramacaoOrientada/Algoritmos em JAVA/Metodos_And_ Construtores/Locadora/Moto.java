package Locadora;

public class Moto {
	public String marca;
	public String modelo;
	public int cilindradas;
	
	public void AtribuirValores(String marcaMoto, String modeloMoto, int cilindradasMoto) {
		marca = marcaMoto;
		modelo = modeloMoto;
		cilindradas = cilindradasMoto;
	}
	public String retornaMarca() {
		return marca;
	}
	
	public String retornaModelo() {
		return modelo;
	}
	
	public int retornaCilindradas() {
		return cilindradas;
	}
}
