package Exercicio2;

public class ContaCorrente extends ContaBancaria {
	
	public void calcularSaldo(double saldo, double qtd) {
		System.out.println("Saldo da conta: "+ (saldo + qtd));
	}
}
