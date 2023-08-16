package Exercicios_Encapsulamento;

public class contaBancaria {
	private double saldo;
	private double limite;
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public boolean saque(double qtd) {
		double chequeEsp = this.saldo + this.limite;
		
		if(qtd <= chequeEsp) {
			saldo = saldo - qtd;
			return true;
		}
		else
			return false;
	}
	
}
