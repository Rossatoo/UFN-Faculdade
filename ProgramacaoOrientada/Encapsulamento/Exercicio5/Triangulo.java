package Exercicio5;

public class Triangulo {
	private double ladoA, ladoB, ladoC;

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public double getLadoC() {
		return ladoC;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}
	
	public boolean ehEquilatero () {
		if(this.ladoA == this.ladoB && this.ladoB == this.ladoC) {
			return true;
		}
		else return false;
	}
}
