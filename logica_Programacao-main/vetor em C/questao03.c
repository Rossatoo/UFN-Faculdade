/* Escreva um algoritmo que leia valores para dois vetores de 20 elementos e então realize a soma dos elementos da mesma posição,
armazenando o resultado em um outro vetor.*/

#include <conio.h>
#include <stdio.h>

main(){
	int i, vetorA[20], vetorB[20], vetorC[20];
	
	for(i=0; i<20; i++){
		printf("\n\nDigite o valor %d do primeiro vetor: ", i);
		scanf("%d", &vetorA[i]);
		printf("\nDigite o valor %d do segundo vetor: ", i);
		scanf("%d", &vetorB[i]);
		
		vetorC[i] = vetorA[i] + vetorB[i];
	}
	
	printf("\n\n-----VETOR C-----\n");
	for(i=0; i<20; i++){
		printf("%d|", vetorC[i]);
	}
	
	getch();
}
