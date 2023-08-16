/* Escreva um programa em C para ler os valores e somar duas matrizes 4 x 4. Mostrar a matriz resultante.*/

#include <stdio.h>
#include <conio.h>

main(){
	int i,j;
	int a[4][4], b[4][4], c[4][4];
	
	//Montando a matriz a
	for(i=0;i<4;i++){
        for(j=0;j<4;j++){
           a[i][j] = i+j;
        }
    }
    
    //Montando a matriz b
    for(i=0;i<4;i++){
        for(j=0;j<4;j++){
           b[i][j] = i*j;
        }
    }
	
	//Matriz C recebe a soma das Matrizes A e B
	for(i=0;i<4;i++){
        for(j=0;j<4;j++){
          c[i][j] = a[i][j] + b[i][j];
        }
    }
    
	//Mostrando a matriz a 
	printf("\n\n************* MATRIZ A ********\n\n");
	for(i=0;i<4;i++){
        for(j=0;j<4;j++){
            printf("%d ",a[i][j]);
        }
        printf("\n");
    }
    
    //Mostrando a matriz b    
    printf("\n\n************* MATRIZ B ************\n\n");
    for(i=0;i<4;i++){
        for(j=0;j<4;j++){
            printf("%d ",b[i][j]);
        }
        printf("\n");
    }
    
	//Mostrando a matriz c	
	printf("\n\n************* MATRIZ C **************\n\n");
	for(i=0;i<4;i++){
        for(j=0;j<4;j++){
            printf("%d ",c[i][j]);
        }
        printf("\n");
    }
	getch();
}
