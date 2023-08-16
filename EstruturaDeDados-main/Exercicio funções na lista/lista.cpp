#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;

#include "util.h"

Celula *popular(Celula *lista, int n) {
    srand(time(NULL));
    for (int i = 0; i < n; i++) {
        lista = inserirListaSimples(rand() % 100, lista);
    }
    return lista;
}

int main() {
    Celula *lista = NULL;
    lista = popular(lista, 10);
    exibirListaSimples(lista);

    //contar celulas
    cout << "Celulas: " << contarCelulas(lista) << endl;
    //localizar o menor valor
    cout << "Menor valor: " << localizarMenorValor(lista) << endl;
    //localizar o maior valor
    cout << "Maior valor: " << localizarMaiorValor(lista) << endl;
    //calcular e exibir a média
    cout << "Media dos valores: " << calcularMedia(lista) << endl;
    //fazer uma versao do inserir que nao permita duplicados
    return 1;
}