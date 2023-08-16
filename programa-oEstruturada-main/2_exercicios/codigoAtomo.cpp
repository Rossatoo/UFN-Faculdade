/* 
1) Definir o struct Atomo;
2) Declarar vetorAtomos de N posicoes;
3) Receber os valores de atomos:
    *randomizar x, y, z de 0 a 10;*/

#include <iostream>
#define TAM 5
using namespace std;

typedef struct {
    string sigla;
    int posicaoX;
    int posicaoY;
    int posicaoZ;
} Atomo;

int main () {
     Atomo vetorAtomo[TAM];   

  for (int i = 0; i < TAM; i++) {
    cout << "Digite a sigla do atomo " << (i+1) << ": ";
    cin >> vetorAtomo[i].sigla;

    cout << "Posicao X: ";
    cin >> vetorAtomo[i].posicaoX;

    cout << "Posicao Y: ";
    cin >> vetorAtomo[i].posicaoY;

    cout << "Posicao Z: ";
    cin >> vetorAtomo[i].posicaoZ;

 }

    cout << "\n-----Exibindo os valores------";
    for (int i = 0; i < TAM; i++)
    {
        cout << "Sigla do Atomo " << (i+1) << ": " << vetorAtomo[i].sigla;
        cout << "Posicao X: " << vetorAtomo[i].posicaoX;
        cout << "Posicao Y: " << vetorAtomo[i].posicaoY;
        cout << "Posicao Z: " << vetorAtomo[i].posicaoZ << endl;
        cout << "_____________________________\n";
    }
    

    return 0;
}