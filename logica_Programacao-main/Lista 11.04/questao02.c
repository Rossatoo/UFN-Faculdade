#include <stdio.h>
#include <conio.h>

main(){
	int numero;
	
	printf("Digite um numero: ");
	scanf("%d", &numero);
	
	if(numero % 2 == 0){
		printf("\nO numero e PAR");
	}
	else {
		printf("O numero e IMPAR");
	}

	getch();
}
