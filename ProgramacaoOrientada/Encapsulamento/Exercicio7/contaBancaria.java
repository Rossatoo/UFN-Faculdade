package Exercicio7;

public class contaBancaria {
	private String titular;
	private int numero;
	private double saldo;
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void deposita(int qtd) {
		this.saldo = this.saldo + qtd;
	}
	
	public void saca(int qtd) {
		if(this.saldo >= qtd) {
			this.saldo = this.saldo - qtd;
		}
		
		else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public double exibeSaldo() {
		return this.saldo;
	}
}
