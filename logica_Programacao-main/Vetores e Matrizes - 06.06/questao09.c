//Escreva um programa que leia uma matriz de ordem 5 e verifique se os elementos da diagonal principal (da esquerda para a direita) são os mesmos da diagonal secundária (direita pra esquerda).

#include <conio.h>
#include <stdio.h>

main(){
	int i, j, matrizA[5][5], diagonalP, diagonalS;
	
		//Montando a matriz 5 x 5 
	for(i=0; i<5; i++){
	for(j=0; j<5; j++){
		
		matrizA[i][j] = i + j;
	}
	}
	
	//Mostrando a matriz 
	for(i=0;i<5;i++){
    for(j=0;j<5;j++){
            
		printf("%d |",matrizA[i][j]);
    }
        printf("\n");
    }
    
    //Pegando os elementos da diagonal principal
    for(i=0; i<5; i++){
	for(j=0; j<5; j++){
		
		if(i==j){
			diagonalP = matriz[i][j];
		}
	}
	}
	
	//Pegando os elementos da diagonal secudaria
	for(i=0; i<5; i++){
	for(j=0; j<5; j++){
		
		if(i == 5-1-j){
			diagonalS = matrizA[i][j];
		}
	}
	}
	
	printf("\n\nDiagonal principal = %d", diagonalP);
	printf("\n\nDiagonal secundaria = %d", diagonalS);
	//Verificando se a diagonal principal é igual a diagonal secundaria
	if(diagonalP == diagonalS){
		printf("A diagonal principal eh IGUAL  a diagonal secundaria");
	}
	else{
		printf("A diagonal principal eh DIFERENTE da diagonal secundaria");
	}
	getch();
}
