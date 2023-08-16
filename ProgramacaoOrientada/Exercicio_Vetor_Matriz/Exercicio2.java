package pacote;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[10][10];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				
				System.out.println("Digite o elemento: ");
				matriz[i][j] = sc.nextInt();
				
			}
		}
					
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				
				System.out.print(matriz[i][j] + "\t ");
			}
			System.out.println();
		}
	}

}
