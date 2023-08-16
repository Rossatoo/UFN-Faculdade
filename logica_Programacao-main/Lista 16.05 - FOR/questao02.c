/*Dado um limite inferior e superior, calcule a soma de todos os números pares contidos nesse intervalo.*/


#include <conio.h>
#include <stdio.h>

main(){
	int limiteInferior, limiteSuperior, i, soma = 0;
	
	printf("Digite o limite inferior: ");
	scanf("%d", &limiteInferior);
	
	printf("Digite o limite Superior: ");
	scanf("%d", &limiteSuperior);
	
	for(i = limiteInferior + 1; i < limiteSuperior; i++){
		if (i % 2 == 0){
		
	 soma = soma + i;
	}
}	
	printf("A soma dos numeros pares desse intervalo eh %d", soma);
	getch();
}
