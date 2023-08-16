/*
 Escreva um algoritmo para ler o número de eleitores de um município, o número de votos brancos, nulos e válidos. Calcule e escreva o percentual que cada um representa
 em relação ao total de eleitores.
*/

#include <stdio.h>

main(){
	int eleitores, votosBrancos, votosNulos, votosValidos;
	float porcent_brancos, porcent_nulos, porcent_validos;
	
	printf("Entre com o numero de eleitores: ");
	scanf("%d", &eleitores);
	
	printf("Entre com o numero de votos em branco: ");
	scanf("%d", &votosBrancos);
	
	printf("Entre com o numero de votos nulos: ");
	scanf("%d", &votosNulos);
	
	printf("Entre com o numero de votos validos: ");
	scanf("%d", &votosValidos);
	
	porcent_brancos = (votosBrancos * 100)/eleitores;
	printf("\n\nO porcentual de votos em brancos foi: %f\n", porcent_brancos);
	
	porcent_nulos = (votosNulos * 100)/eleitores;
	printf("O porcentual de votos nulos foi de: %f\n", porcent_nulos);
	
	porcent_validos = (votosValidos * 100)/eleitores;
	printf("O porcentual de votos validos foi de: %f\n", porcent_validos);
	
	getch();
}
