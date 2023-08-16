//Escreva um algoritmo para transpor uma matriz 3x4 para outra 4x3. Transpor uma matriz significa transformar suas linhas em colunas e vice-versa

#include <conio.h>
#include <stdio.h>

main(){
	int i,j, matrizA[3][4], matrizB[4][3];
	
	//Montando a matriz A 
	for(i=0; i<3; i++){
	for(j=0; j<4; j++){
		
		matrizA[i][j] = i + j;
	}
	}
	
		//Mostrando a matriz A
	printf("----MATRIZ A-----\n\n");
	for(i=0;i<3;i++){
    for(j=0;j<4;j++){
            
		printf("%d |",matrizA[i][j]);
    }
        printf("\n");
    }
    
    printf("\n\n\n----MATRIZ B----\n\n");
    //Transpondo a matriz A para a Matriz B
    for(i=0; i<4; i++){
	for(j=0; j<3; j++){
		
		matrizB[i][j] = matrizA[i][j];
		//Mostrando a Matriz B
		printf("%d |", matrizB[i][j]);
	}
		printf("\n");
	}
	getch();
}
