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
    for (int i = 0; i <= lin-1; i++) {
        for (int j = 0; j <= col-1; j++) {
            printf("%d\t",matriz[i][j]);
        }
        printf("\n");
    }
}

int contarParesR(int matriz[TAM][TAM], int lin, int col, int backlin, int backcol){
    if (col > 0) {
        if(matriz[lin-1][col-1] % 2 == 0){

            return 1 + contarParesR(matriz, lin, col - 1, backlin, backcol);
        }        

         return 0 + contarParesR(matriz, lin, col - 1, backlin, backcol);

    } else if (lin - 1 > 0) {
        return 0 + contarParesR(matriz, lin - 1, backcol ,backlin, backcol);
    }
    return 0;
}

int main(){
    int matriz[TAM][TAM];
    srand(time(NULL));
    popular(matriz, TAM, TAM);
    exibir(matriz, TAM, TAM);
    printf("\n");
    printf("Quantidade de numeros pares: %d",contarParesR(matriz, TAM, TAM, TAM, TAM));
}