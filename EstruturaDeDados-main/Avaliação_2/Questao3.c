#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define TAM 5



void popularVetorR(int *v, int n, int valorInicial) {
    v[0] = valorInicial;
    if (n > 1) {

        popularVetorR(v, n-1, valorInicial); //ponto de recursao
        
        v[n-1] = rand() % 10;
    }
}

void exibirVetorR(int *v, int n) {
    if (n > 0) {

        exibirVetorR(v, n-1); //ponto de recursao
        
        printf("[%d]:%d\n", n-1, v[n-1]);
    }
}

void trocarNumeros(int *v, int n, int Valor) {
    if (n > 0) {
        trocarNumeros(v, n-1, Valor); 
        v[n-1] = Valor; 
    }
}

int main() {
    int vetor[TAM];
  
    srand(time(NULL));
    popularVetorR(vetor, TAM, 5);
    exibirVetorR(vetor, TAM);
    trocarNumeros(vetor, TAM, 5);
    printf("\nVetor com numeros trocados: \n");
    exibirVetorR(vetor, TAM);

    return 1;
}