package Prova;

public class CarroEsportivo extends Carro {
	private int potenciaMotor;

	public int getPotenciaMotor() {
		return potenciaMotor;
	}

	public void setPotenciaMotor(int potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}
	
	
	public void aumentarPotenciaMotor(int qtd) {
		this.potenciaMotor += qtd;
	}
	
	
	
	
}
