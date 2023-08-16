/*Fazer um algoritmo que leia vinte números inteiros armazenando-os em um vetor, a seguir, troque o conteúdo da primeira posição do vetor com o conteúdo da décima primeira posição, o conteúdo da segunda posição com o da décima segunda,
e assim, sucessivamente até trocar o conteúdo da décima com o da vigésima e escreva o vetor após estas modificações. */

#include <conio.h>
#include <stdio.h>

main(){
	int i, vetorA[20], auxiliar, cont=10;
	
	//Leitura dos valores do vetor
	for(i=0; i<20; i++){
		printf("Digite o valor da posicao %d: ", i);
		scanf("%d", &vetorA[i]);
	}
	
	//Fazendo as modificações
	for(i=0; i<10; i++){
		
		auxiliar = vetorA[i];
		vetorA[i] = vetorA[cont];
		vetorA[cont] = auxiliar;
		cont++;
	}
	
	for(i=0; i<20; i++){
		printf("%d |", vetorA[i]);
	}
	
	getch();
}
