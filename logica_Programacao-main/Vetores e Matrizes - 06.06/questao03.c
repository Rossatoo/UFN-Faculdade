//Escreva um algoritmo que leia os valores para um vetor de 10 elementos, e em seguida ordene em ordem crescente os valores desse vetor, utilizando um vetor auxiliar

#include <conio.h>
#include <stdio.h>

main(){
	int i,j, vetorA[10], auxiliar, vetorB[10]; 
	
	//Leitura dos valores
	for(i=0; i<10; i++)
	{
		printf("Digite o valor da posicao %d: ", i);
		scanf("%d", &vetorA[i]);
	}
	
	//Colocando os valores em ordem crescente
	for(i=0; i<10; i++)
	{
		for(j=i+1; j<10; j++)
		{
			if(vetorA[i] > vetorA[j])
			{
				auxiliar = vetorA[i];
				vetorA[i] = vetorA[j];
				vetorA[j] = auxiliar;
			}
			
		}	
		
	}
	
	//Transpondo e Imprimindo os valores 
	for(i=0; i<10; i++){
		vetorB[i] = vetorA[i];
		printf("%d", vetorB[i]);
	}
	getch();
}
