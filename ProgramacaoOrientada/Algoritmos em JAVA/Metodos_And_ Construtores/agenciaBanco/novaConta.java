package agenciaBanco;

import java.util.Scanner;

public class novaConta {

	public static void main(String[] args) {
		contaCorrente cc = new contaCorrente();
		Scanner sc = new Scanner(System.in);
		
		cc.definirSaldoInicial(1000);
		System.out.println("O saldo inicial da conta eh: " +cc.saldo);

		cc.sacar(500);
		cc.depositar(50);
		System.out.println("O saldo atual da conta eh: " +cc.saldo);
		cc.sacar(600);
		System.out.println("O saldo atual da conta eh: " +cc.saldo);
	}

}
