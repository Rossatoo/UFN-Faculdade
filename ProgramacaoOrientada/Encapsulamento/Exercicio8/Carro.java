package Exercicio8;

public class Carro {
	private String placa;
	private int numChassi;
	private int veloc;
	public boolean acel = true;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getNumChassi() {
		return numChassi;
	}
	public void setNumChassi(int numChassi) {
		this.numChassi = numChassi;
	}
	
	public int getVeloc() {
		return veloc;
	}
	public void setVeloc(int veloc) {
		this.veloc = veloc;
	}
	
	public void acelerar(int qtd) {
		this.veloc = this.veloc + qtd;
	}
	
	public boolean frear() {
		this.acel = false;
		if (this.acel == false) {
			return true;
		}
		else return false;
	}
}