//Fazer um algoritmo que leia dez números inteiros armazenando-os em um vetor e escreva primeiramente todos os números pares lidos e após todos os ímpares

#include <conio.h>
#include <stdio.h>

main(){
	int i, vetorA[10];
	
	//Leitura dos valores 
	for(i=0; i<10; i++){
	
	printf("Digite o valor %d do vetor: ", i);
	scanf("%d", &vetorA[i]);
	
	}
	
	//Imprimindo os numeros pares
	for(i=0; i<10; i++){
		if(vetorA[i] % 2 == 0){
			printf("%d|", vetorA[i]);
		}
	}
	
	//imprimindo os numeros impares
	for(i=0; i<10; i++){
		if(vetorA[i] % 2 == 1){
			printf("%d|", vetorA[i]);
		}
	}
	getch();
}
