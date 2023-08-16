package pacote;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float notas[][] = new float[3][4];
		float maior1 = 0, maior2 = 0, maior3 = 0, maior4 = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.println("Digite a nota " + (j + 1)  + " do aluno " + (i + 1));
				notas[i][j] = sc.nextFloat();				
			}
		}
		
		//Descobrindo a maior nota da primeira disciplina
		for(int i=0; i<3; i++) {
			if(notas[i][0] > maior1)
				maior1 = notas[i][0];
			
			if(notas[i][1] > maior2)
				maior2 = notas[i][1];
			
			if(notas[i][2] > maior3)
				maior3 = notas[i][2];
			
			if(notas[i][3] > maior4)
				maior4 = notas[i][3];

		}
				
				
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(notas[i][j] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("maior nota da primeira disciplina: " + maior1);
		System.out.println("maior nota da segunda disciplina: " + maior2);
		System.out.println("maior nota da terceira disciplina: " + maior3);
		System.out.println("maior nota da quarta disciplina: " + maior4);
	}

}
