package Exercicios_Encapsulamento;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		contaBancaria cb = new contaBancaria();
		
		System.out.println("Digite o saldo da conta: ");
		cb.setSaldo(sc.nextDouble());
		
		System.out.println("Digite o limite da conta: ");
		cb.setLimite(sc.nextDouble());
		
		System.out.println("Entre com o valor que deseja sacar: ");
		double qtd = sc.nextDouble();
		
		if (cb.saque(qtd) == true) {
			System.out.println("Saque efetuado com sucesso!!");
			System.out.println("Novo saldo: "+cb.getSaldo());
			}
		else {
			System.out.println("Valor fora do limite!!");
		}
	}

}
