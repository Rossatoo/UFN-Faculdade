//1) Fazer um programa em C++, populando um vetor (tamanho N) com números aleatórios de 0 a 100. Na sequência, o vetor deve ser exibido, bem como o maior e o menor valor inseridos.

#include <iostream>
#include <ctime>
#include <cstdlib>

using namespace std;

int main() {

    //Populando o vetor
    int vetor[10];
    srand(time(NULL));
    
    cout << "Valores do vetor \n";
    for(int i = 0; i < 10; i++){
        vetor[i] = rand() % 100;
    }
    //Exibindo o vetor
    for(int i = 0; i < 10; i++){
        cout << vetor[i] << "\t";
    }

    //Descobrindo o menor valor

    int menor = vetor[0];

    for (int i = 1; i < 10; i++){
        if(vetor[i] < menor){
            menor = vetor[i];
        }
    }
    cout << "\nO menor valor encontrado na estrututa eh " << menor << endl;
    
    //Descorindo o maior valor
    
    int maior = vetor[0];

    for (int i = 1; i < 10; i++){
        if(vetor[i] > maior){
            maior = vetor[i];
        }
    }
    cout << "\nO maior valor encontrado na estrututa eh " << maior << endl;
    return 1;
}