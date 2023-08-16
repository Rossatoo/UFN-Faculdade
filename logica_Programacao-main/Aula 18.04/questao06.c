/* Escreva um algoritmo que leia o placar de um jogo da primeira fase da copa do Brasil. Caso o time de fora tenha ganho o jogo por mais de 2 gols de diferença, 
mostre na tela uma mensagem indicando que o time de fora já se classificou para a próxima fase. Caso contrário, mostre uma mensagem indicando que os dois times
 irão se enfrentar novamente em um novo jogo.

ex: time da casa 4 x 3 time de fora, mostra "Os dois times se enfrentarão em um novo jogo"

ex2: time da casa 1 x 3 time de fora, mostra "O time de fora já se classificou"

plus: caso ocorra um segundo jogo, leia o placar desse novo jogo e então diga quem passou de fase.*/

#include <stdio.h>
#include <conio.h>

main(){
	int golsTimeCasa, golsTimeFora, diferenca, golsCasa, golsFora;
	
	printf("Digite o numero de gols do time da casa: ");
	scanf("%d", &golsTimeCasa);
	
	printf("Digite o numero de gols do time de fora: ");
	scanf("%d", &golsTimeFora);
	
	diferenca = golsTimeFora - golsTimeCasa;
	
		if(diferenca >= 2){
			printf("O time de fora ja esta classificado");
		}
		else {
			printf("\nPrecisara ser realizado outro jogo!");
			
			printf("\n\nQuantos gols o time da casa fez no segundo jogo?: ");
			scanf("%d", &golsCasa);
			
			printf("\nQuantos gols o time de fora fez no segundo jogo?: ");
			scanf("%d", &golsFora);
			
				if(golsCasa > golsFora){
					printf("O time da casa passou de fase");
				}
				else if(golsFora > golsCasa){
					printf("O time de fora passou de fase");
				}
				else {
					printf("O jogo foi para os penaltis");
				}
		}
	getch();
}
