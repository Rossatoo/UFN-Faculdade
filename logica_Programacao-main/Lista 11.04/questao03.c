#include <stdio.h>
#include <conio.h>

main(){
	float num1, num2, num3, num4, media;
	
	printf("Digite o primeiro numero: ");
	scanf("%f", &num1);
	
	printf("Digite o segundo numero: ");
	scanf("%f", &num2);
	
	printf("Digite o terceiro numero: ");
	scanf("%f", &num3);
	
	printf("Digite o quarto numero: ");
	scanf("%f", &num4);
	
	media = (num1 + num2 + num3 + num4)/4;
	
	printf("\nMedia = %f\n", media);
	
	if (num1 > media){
		printf("\nO primeiro numero eh maior que a media");
	}
	
	if	(num2 > media){
		printf("\nO segundo numero eh maior que a media");
	}
	
	if	(num3 > media){
		printf("\nO terceiro numero eh maior que a media");
	}
	
	if	(num4 > media){
		printf("\nO quarto numero eh maior que a media");
	}
	
	getch();
}
