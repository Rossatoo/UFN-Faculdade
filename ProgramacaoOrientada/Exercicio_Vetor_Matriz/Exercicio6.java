package pacote;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] cidades =  new String[5];
		float[] populacao = new float[5];
		float maiorPop = populacao[0];
		int indiceMaior = 0;
		
		for(int i = 0; i < cidades.length; i++) {
			System.out.println("Digite o nome da cidade: " + (i + 1));
			cidades[i] = sc.nextLine();
			System.out.println("E agora a sua populacao: ");
			populacao[i] = sc.nextFloat();
			sc.nextLine();
			}
		
		for(int i = 0; i < cidades.length; i++) {
			if(populacao[i] > maiorPop){
				maiorPop = populacao[i];
				indiceMaior = i;
				
			}
			
				
			}
		System.out.println("Cidade mais populosa: " + cidades[indiceMaior]);
		}
		
		
			
		}
		
		
