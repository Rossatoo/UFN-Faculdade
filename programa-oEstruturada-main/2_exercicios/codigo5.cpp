/*
 * 5 - Faça um algoritmo que possua dois vetores, 
 * um preenchido com valores seqüenciais de 0 a 9 e outro com valores sequenciais de 10 a 19, 
 * e intercale-os num terceiro vetor formando uma nova variável. Mostre o vetor obtido.
 */

#include <iostream>

using namespace std;

int main () {
    int vetorA[10];
    int vetorB[10];
    int vetorC[20];

    // populando os vetores A e B
    for (int i = 0; i < 10; i++)
    {
        vetorA[i] = i; 
    }

    for (int j = 10; j < 20; j++)
    {
        vetorB[j] = j;
    }
    
    // exibindo os vetores A e B
    cout << "VETOR A:  \n";
    for (int i = 0; i < 10; i++)
    {
        cout << vetorA[i] << "\t";
    }

    cout << "\nVETOR B: \n";
    for (int j = 10; j < 20; j++)
    {
        cout << vetorB[j] << "\t";
    }
    
    // populando o vetor C 
    

    return 0;
}