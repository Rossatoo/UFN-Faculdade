/**
 * Recursão == repetição
 *  - void
 *  - return
*/

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define TAM 5

typedef struct no {
    int dado;
    struct no *prox;
} Celula;


void exibirListaR(Celula *lista) {
    if (lista) {
        printf("%d\n", lista->dado);
        exibirListaR(lista->prox);
    }
}

Celula *inserirListaR(int valor, Celula *lista) {
    if (lista && valor > lista->dado) {
        lista->prox = inserirListaR(valor, lista->prox);
        return lista;
    } else { //cheguei no final da lista
        Celula *novo = (Celula *)malloc(sizeof(Celula));
        novo->dado = valor;
        if (!lista) {
            novo->prox = NULL;
        } else {
            novo->prox = lista;
        }
        return novo;
    }
}


int somarListaR(Celula *lista) {
    if (lista) {
        return lista->dado + somarListaR(lista->prox);
    }
    return 0;
}

//10 -> 20 -> 30 
int contarListaR(Celula *lista) {
    if (lista) {
        return 1 + contarListaR(lista->prox);
    }
    return 0;
}

int localizarR(int valor, Celula *lista, int posicao) {
    if (lista) {
        if (lista->dado == valor) {
            return posicao;
        } else {
            return localizarR(valor, lista->prox, posicao+1);
        }
    }
    return 1;
}

Celula *excluirR (int valor, Celula *lista){
    if (lista){
        if (valor == lista->dado){
            Celula *prox = lista->prox;
            free(lista);
            return prox;
            } else {
            lista->prox = excluirR(valor, lista->prox);
            } 
            return lista;
    }
    return NULL;
}

int main() {
    Celula *lista = NULL;
  
    srand(time(NULL));
    for (int i = 0; i < TAM; i++) {
        lista = inserirListaR(rand() % 10, lista);
    }
    exibirListaR(lista);

    printf("Total de elementos: %d\n", contarListaR(lista));
    printf("A soma dos elementos: %d\n", somarListaR(lista));

    int valorPesquisa;
    printf("Digite valor a pesquisar: ");
    scanf("%d", &valorPesquisa);

    printf("%d localizado na posicao %d\n", valorPesquisa, localizarR(valorPesquisa, lista, 0));

    int valorExcluir;
    printf("Digite valor a excluir: ");
    scanf("%d", &valorExcluir);
    lista = excluirR(valorExcluir, lista);
    exibirListaR(lista);    
}