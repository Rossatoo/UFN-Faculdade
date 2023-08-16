package Exercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContaBancaria cb = new ContaBancaria();
		
		System.out.println("Digite o saldo da conta corrente: ");
		double saldo = sc.nextDouble();
		
		System.out.println("Digite a quantidade do valor depositado: ");
		double deposito = sc.nextDouble();
		
		cb = new ContaCorrente();
		cb.calcularSaldo(saldo, deposito);
	}

}
