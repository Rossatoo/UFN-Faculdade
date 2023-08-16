//metodos recursivos sobre vetores
//popular recursivo
//exibir recursivo
//filtrar recursivo

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define TAM 5

void popularR(int matriz[TAM][TAM], int lin, int col, int backup) {
    if (col > 0) {
        popularR(matriz, lin, col - 1, backup);        
        matriz[lin - 1][col - 1] = rand() % 10;
        if(matriz[lin - 1][col - 1] % 2 == 0){
        printf("[%d][%d]: %d\n", lin-1, col-1, matriz[lin - 1][col - 1]);}
    } else if (lin - 1 > 0) {
        popularR(matriz, lin - 1, backup, backup);
    }
}


int main() {    
    int n = TAM;
    int matriz[TAM][TAM];

    srand(time(NULL));
    printf("Numero pares e suas posicoes na matriz: \n");
    popularR(matriz, n, n, n);
    
    

    return 1;
}