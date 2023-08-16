package Exercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario f = new Funcionario();
		
		System.out.println("Entre com o salario: ");
		double salario = sc.nextDouble();
		
		f = new Gerente();
		System.out.println("Salario do gerente: "+f.calcularSalario(salario));

	}

}
