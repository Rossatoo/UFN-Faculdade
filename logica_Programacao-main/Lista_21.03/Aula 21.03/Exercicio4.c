/* Um carro percorreu determinada distância em determinado tempo. Desenvolva o algoritmo para ler estes dados e calcular a velocidade média do carro.
Sabe-se que a velocidade média é a razão entre a distância percorrida e o tempo para percorrê-la.*/

#include <stdio.h>

main(){
	float distancia, tempo, veloc_media;
	
	printf("Entre com a distancia de km que o carro percorreu: ");
	scanf("%f", &distancia);
	
	printf("Entre com o tempo em horas que o carro levou: ");
	scanf("%f", &tempo);
	
	veloc_media = distancia / tempo;
	
	printf("A velocidade media em m/s do carro foi de: %f km/h", veloc_media);
	
	
	getch();
}
