#include <iostream>
#include <cstdlib>

using namespace std;

typedef struct no {
    int dado;
    struct no *prox;
} Celula;

Celula *inserir(int valor, Celula *topo){

//Alocando memoria
Celula *novo = (Celula *)malloc(sizeof(Celula));

//Depositando valores no parametro
novo->dado = valor;

//engatar o novo elemento alocado no ultimo elemento 
novo->prox = topo;

//retornar o novo topo
return novo;
}

void exibir(Celula *topo) {
    if (!topo) {
        cout << "Pilha vazia!\n";
        return ;
    }
    Celula *p;
    for (p = topo; p != NULL; p = p->prox) { //rotina classica para percorrer uma pilha, lista simples, uma fila, etc......
        cout << p->dado << "\n";
    }
    cout << endl;
}

int contar(Celula *topo) {
    Celula *p;
    int qtd = 0;

    if (!topo) return qtd;

    for (p = topo; p != NULL; p = p->prox) {
        qtd++;
    }

    return qtd;
}

Celula *remover(Celula *topo){
    //testar se vazia
    if (!topo) {
        cout << "Pilha vazia\n";
        return topo;
    }
    
    //apontar lixo para o topo
    Celula *lixo;
    lixo = topo;

    //avancar o topo ao proximo elemento
    topo = topo->prox;

    //liberar o lixo
    free(lixo);

    //retornar o topo deslocado
    return topo;
}