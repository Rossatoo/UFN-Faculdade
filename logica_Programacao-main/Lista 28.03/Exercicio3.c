#include <stdio.h>

main(){
	float nota1, nota2, nota3, media;
	
	printf("Digite o valor da primeira nota: ");
	scanf("%f", &nota1);
	
	printf("Digite o valor da segunda nota: ");
	scanf("%f", &nota2);
	
	printf("Digite o valor da terceira nota: ");
	scanf("%f", &nota3);
	
	printf("\n\nPrimeira nota: %.1f", nota1);
	printf("\nSegunda nota: %.1f", nota2);
	printf("\nTerceira nota: %.1f", nota3);
	
	media = (nota1 + nota2 + nota3)/3;
	
	printf("\n\nMedia final: (%.1f + %.1f + %.1f)/3 = %.1f", nota1, nota2, nota3, media);
	
	getch();
}
