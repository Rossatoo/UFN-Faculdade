package pacote;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float notas[][] = new float[3][4];
		float mediaDisciplina1 = 0, mediaDisciplina2 = 0, mediaDisciplina3 = 0, mediaDisciplina4 = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.println("Digite a nota " + (j + 1)  + " do aluno " + (i + 1));
				notas[i][j] = sc.nextFloat();
				
				mediaDisciplina1 = (notas[0][0] + notas[1][0] + notas[2][0]) / 3;
				mediaDisciplina2 = (notas[0][1] + notas[1][1] + notas[2][1]) / 3;
				mediaDisciplina3 = (notas[0][2] + notas[1][2] + notas[2][2]) / 3;
				mediaDisciplina4 = (notas[0][3] + notas[1][3] + notas[2][3]) / 3;
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(notas[i][j] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("--------------------------------------------");
		System.out.println("Media da primeira disciplina: " + mediaDisciplina1);
		System.out.println("Media da segunda disciplina: " + mediaDisciplina2);
		System.out.println("Media da terceira disciplina: " + mediaDisciplina3);
		System.out.println("Media da quarta disciplina: " + mediaDisciplina4);
	}

}
