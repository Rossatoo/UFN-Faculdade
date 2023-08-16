//Fazer um algoritmo que leia trinta números reais armazenando-os em um vetor e após escreva a posição de cada número menor que zero desse vetor.

#include <conio.h>
#include <stdio.h>

main(){
	int i;
	float vetorA[30];
	
	//Leitura dos valores
	for(i=0; i<30; i++){
		printf("Digite o valor %d do vetor: ", i);
		scanf("%f", &vetorA[i]);
	}
	
	//Verificando e imprimindo os valores menores que zero
	printf("\n\nsão menores que 0 os numeros das posicoes: : ");
	for(i=0; i<30; i++){
		if (vetorA[i] < 0){
			printf("%d|", i);
		}
	}
	
	
	getch();
}
