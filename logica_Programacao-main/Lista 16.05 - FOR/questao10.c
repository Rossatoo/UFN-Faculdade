#include <conio.h>
#include <stdio.h>

main(){
	int i;
	float div=1000, soma;
	
	
	for (i=1 ; i<=50; i++){
		if(i % 2 == 0){
			soma = soma - (div/i);
			div = div - 3;
			printf("%f\n\n", soma);
	}
		else if(i % 2 == 1){
			soma = soma + (div/i);
			div = div - 3;
			printf("%f\n\n", soma);	
		}
	}
	printf("A soma eh %f", soma);
	
	
	getch();
}
