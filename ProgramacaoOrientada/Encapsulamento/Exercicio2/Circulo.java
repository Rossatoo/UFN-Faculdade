package Exercicio2;

public class Circulo {
	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double calculaArea () {

		return (3.14 * Math.pow(this.raio, 2));
	}
}
