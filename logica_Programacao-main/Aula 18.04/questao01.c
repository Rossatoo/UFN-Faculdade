/*Escreva um algoritmo que leia um ponto (x,y) pelo teclado e informe em qual quadrante o ponto se encontra no plano cartesiano ou se o ponto está sobre um dos eixos.*/

#include <stdio.h>
#include <conio.h>

main(){
	float x, y;
	
	printf("Digite o valor de x: ");
	scanf("%f", &x);
	
	printf("Digite o valor de y: ");
	scanf("%f", &y);
	
	if(x > 0 && y > 0){
		printf("O ponto esta no primeiro quadrante");
	}
		
	if(x > 0 && y < 0){
			printf("O ponto esta no quarto quadrante");
		}
		
	if(x < 0 && y < 0){
			printf("O ponto esta no terceiro quadrante");
		}
		
	if (x < 0 && y > 0){
			printf("O ponto esta no segundo quadrante");
		}
	if (x == 0 && y == 0){
		printf("O ponto esta no centro do plano");
	}
	
	if (x == 0 && y != 0){
		printf("O ponto esta no eixo x");
	}
	
	if (x != 0 && y == 0){
		printf("O ponto esta no eixo y");
	}
	
	
	
	
	
}
