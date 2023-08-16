#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define TAML 5
#define TAMC 3


void inicializarR(int matriz[TAML][TAMC], int lin, int col, int backLin, int backcol)
{
    if (col > 0) {
        matriz[lin - 1][col - 1] = 0;
        inicializarR(matriz, lin, col - 1, backLin, backcol);
    } else if (lin > 0) {
        inicializarR(matriz, lin - 1, backcol ,backLin, backcol);
    }
}

void preencherR(int matriz[TAML][TAMC], int lin, int col, int backLin, int backcol)
{
    if (col > 0) {
        if (lin + col == TAML) {
            matriz[lin - 1][col - 1] = 1;
        }
        preencherR(matriz, lin, col - 1, backLin, backcol);
    } else if (lin > 0) {
        preencherR(matriz, lin - 1, backcol ,backLin, backcol);
    }
}

void exibirR(int matriz[TAML][TAMC], int lin, int col, int backLin, int backcol) {
    if (col > 0) {
        exibirR(matriz, lin, col - 1, backLin, backcol);
        printf("%d\t",matriz[lin - 1][col - 1]);
    } else if (lin > 0) {
        exibirR(matriz, lin - 1, backcol ,backLin, backcol);
        printf("\n");
    }
}


int main(){
int matriz[TAML][TAMC];

inicializarR(matriz, TAML, TAMC, TAML, TAMC);
preencherR(matriz, TAML, TAMC, TAML, TAMC);
exibirR(matriz, TAML, TAMC, TAML, TAMC);
    return 1;
}