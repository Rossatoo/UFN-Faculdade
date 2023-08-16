package Disciplina;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Disciplina d = new Disciplina();
		String nomeD, nomeP;
		double cargaH;
		
		System.out.println("Entre com o nome da disciplina: ");
		nomeD = sc.nextLine();
		
		System.out.println("Enre com o nome do professor: ");
		nomeP = sc.nextLine();
		
		System.out.println("Entre com a carga Horaria: ");
		cargaH = sc.nextDouble();
		sc.nextLine();
		
		d.atribuirValores(nomeD, nomeP, cargaH);
		
		System.out.println("Discipina: "+d.retornaNomeD()+ "\nProfessor: "+d.retornaNomeP()+ "\nCarga Horaria: "+d.retornaCargaH());

	}

}
