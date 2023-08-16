#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define TAM 5

void popular(int matriz[TAM][TAM], int lin, int col) {
    for (int i = 0; i < lin; i++) {
        for (int j = 0; j < col; j++) {
            matriz[i][j] = rand() % 10;
        }
    }
}

void exibir(int matriz[TAM][TAM], int lin, int col) {
    for (int i = 0; i < lin; i++) {
        for (int j = 0; j < col; j++) {
            printf("%d\t",matriz[i][j]);
        }
        printf("\n");
    }
}

void diagonalPR(int matriz[TAM][TAM], int lin, int col, int backlin, int backcol) {

    if (col > 0) {
        if(lin == col){
            diagonalPR(matriz, lin, col - 1, backlin, backcol);
            printf("%d\t",matriz[lin - 1][col - 1]);
        } 
        else{
            diagonalPR(matriz, lin, col - 1, backlin, backcol);
        }

    } else if (lin - 1 > 0) {
       diagonalPR(matriz, lin - 1, backcol ,backlin, backcol);
        
    }
}


int main(){
int matriz[TAM][TAM];

popular(matriz, TAM, TAM);
exibir(matriz, TAM, TAM);
printf("\nDiagonal PRincipal: \n");
diagonalPR(matriz,TAM, TAM, TAM, TAM);
    return 1;
}