package Exercicio3;

public class Retangulo {
	private double base, altura;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calculaArea() {
		return (this.base * this.altura);
	}
}
