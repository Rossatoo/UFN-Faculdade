#include <stdio.h>

main(){
	float nota1, nota2, mediaFinal;
	
	printf("Entre com a primeira nota: ");
	scanf("%f", &nota1);
	
	printf("Entre com a segunda nota: ");
	scanf("%f", &nota2);
	
	mediaFinal = (nota1 + nota2)/2;
	
	printf("O valor da media eh de: %f", mediaFinal);
	
	getch();
}
