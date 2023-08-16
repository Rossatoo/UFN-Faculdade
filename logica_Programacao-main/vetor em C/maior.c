#include <stdio.h>
#include <conio.h>

main(){
	int vetor[10], i, maior = -10000000000, indicador;
	
	for(i=0; i<10; i++){
		printf("Digite o valor %d\n", i);
		scanf("%d", &vetor[i]);
			if(vetor[i]> maior){
				maior = vetor[i];
				indicador = i;
			}
	}
	printf("\n\nO maior valor de vetor eh %d e ele esta na posicao %d", maior, indicador);
	
	
	
	getch();
}
