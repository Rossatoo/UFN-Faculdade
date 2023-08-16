#include <stdio.h>
#include <conio.h>

main(){
	float valorBase, valorAltura, valorArea;
	
	printf("Digite o valor da da Base: ");
	scanf("%f", &valorBase);
	
	printf("Digite o valor da Altura: ");
	scanf("%f", &valorAltura);
	
	if (valorBase > 0 && valorAltura > 0){
		valorArea = (valorBase * valorAltura)/2;
		printf("\nO valor da area = %f", valorArea);
	}
		else{
			printf("\nDigite valores positivos!!! ");
		}

	
	
	getch();
}
