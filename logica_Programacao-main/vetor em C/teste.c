#include <conio.h>
#include <stdio.h>
#include <math.h>

main(){
	float notas[5], media;
	int i;
	
	printf("\n\n--------Leitura dos valores---------\n\n");
	for(i=0; i<5; i++){
	
	printf("Digite o valor %d: ", i);
	scanf("%f", &notas[i]);
	
}
	media = 0;
	printf("\n\n---------Calculo da media sendo feito----------\n\n");
	for(i=0; i<5; i++){
		media += notas[i];
	}
	media = media/5	;
	
	printf("\n\n--------Mostra a media-------\n\n");
	printf("A media da notas eh %.2f\n", media);
	
	getch();
}
