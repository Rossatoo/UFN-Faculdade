package Prova;

public class Carro {
	private String Modelo, cor;
	private int anoFab, velocAtual;
	
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAnoFab() {
		return anoFab;
	}
	public void setAnoFab(int anoFab) {
		this.anoFab = anoFab;
	}
	public double getVelocAtual() {
		return velocAtual;
	}
	public void setVelocAtual(int velocAtual) {
		this.velocAtual = velocAtual;
	}
	
	public void acelerar(int qtd) {
		this.velocAtual = this.velocAtual + 10;
	}
	
	public void frear(int qtd) {
		if(this.velocAtual > 0) {
			this.velocAtual -= 5;
		}
	}
	
}
