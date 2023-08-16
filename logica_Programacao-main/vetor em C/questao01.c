/*Fazer um algoritmo que leia um vetor de dez números e escreva-os na ordem contrária à ordem de leitura. Exemplo:

lê:                             |7|40|3|9|21|0|63|31|7|22|

escreve:                		|22|7|31|63|0|21|9|3|40|7| */

#include <stdio.h>
#include <conio.h>

main(){
	int i, vetorA[10];
	
	for(i=0; i<10; i++){
		printf("Digite o valor %d\n", i);
		scanf("%d", &vetorA[i]);
	}
	for(i=9; i>=0; i--){
		printf("%d|", vetorA[i]);
	}
	
	
	getch();
}
