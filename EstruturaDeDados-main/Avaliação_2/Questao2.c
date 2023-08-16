#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define TAM 5

void exibir(int matriz[TAM][TAM], int lin, int col) {
    for (int i = 0; i <= lin-1; i++) {
        for (int j = 0; j <= col-1; j++) {
            printf("%d\t",matriz[i][j]);
        }
        printf("\n");
    }
}

void popularR(int matriz[TAM][TAM], int lin, int col, int backLin, int backcol)
{
    if (col > 0) {
        matriz[lin - 1][col - 1] = rand() % 10;
        popularR(matriz, lin, col - 1, backLin, backcol);
    } else if (lin > 0) {
        popularR(matriz, lin - 1, backcol ,backLin, backcol);
    }
}


void exibirR(int matriz[TAM][TAM], int lin, int col, int linha) {
    if(col>0){
        exibirR(matriz, TAM, col - 1, linha);
        printf("%d\t",matriz[linha][col - 1]);
    }
}

int main(){
    int matriz[TAM][TAM];
    srand(time(NULL));
    popularR(matriz, TAM, TAM, TAM, TAM);
    exibir(matriz, TAM, TAM);
    printf("\n Linha escolhida: 3\n");
    exibirR(matriz, TAM, TAM, 3);
}