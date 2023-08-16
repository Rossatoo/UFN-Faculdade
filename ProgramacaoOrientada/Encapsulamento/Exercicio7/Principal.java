package Exercicio7;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		contaBancaria cb = new contaBancaria();
		
		System.out.println("Entre com o numero da conta: ");
		cb.setNumero(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Entre com o titular da conta: ");
		cb.setTitular(sc.nextLine());

		System.out.println("Entre com o saldo da conta: ");
		cb.setSaldo(sc.nextDouble());
		
		cb.deposita(400);
		cb.saca(200);
		
		System.out.println("Saldo da conta: "+cb.exibeSaldo());
	}

}
