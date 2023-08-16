/*Escreva um algoritmo que pergunte ao usuário qual o valor inicial da contagem, qual o valor final, e se ele deseja pular os valores pares ou os valores ímpares.
Após, faça um laço de repetição que mostre os valores desejados.*/

#include <conio.h>
#include <stdio.h>

main(){
	int inicio, fim, escolha, i;
	
	printf("Qual o valor inicial? ");
	scanf("%d", &inicio);
	
	printf("Qual o valor final? ");
	scanf("%d", &fim);
	
	printf("\nVoce deseja pular os valores impares o pares?\n");
	printf("Digite 1 para impar ou 2 para par");
	scanf("%d", &escolha);
	
	switch(escolha){
		case 1:
			for(i=inicio; i<=fim; i++){
				if (i % 2 == 0){
					printf("%d\n", i);
				}
			}
		break;
		
		case 2:
			for(i=inicio; i<=fim; i++){
				if (i % 2 == 1){
					printf("%d\n", i);
				}
			}
		break;
	}
	
	
	getch();
}
