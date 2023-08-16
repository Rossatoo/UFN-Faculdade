//Escrever um algoritmo para ler quatro valores inteiro, calcular a sua média, e escrever na tela os que sao maiores que a média

#include <iostream>
using namespace std;

int main (){
    int vetorValores[4];
    int somaValores = 0;
    float media;

    // Entrando com os valores
    for (int i = 0; i < 4; i++)
    {
        cout << "Digite o valor " << (i+1) << ": ";
        cin >> vetorValores[i];
        somaValores = somaValores + vetorValores[i];
    }

    media = somaValores / 4;    

    cout << "A soma dos valores eh: " << somaValores;
    cout << "\nA media dos valores eh: " << media << endl;
    
    // Exibindo os valores que sao maiores que a media 
    for (int i = 0; i < 4; i++)
    {
        if (vetorValores[i] > media)
        {
            cout << vetorValores[i] << " eh maior que a media" << endl;
        }
        
    }

    return 0;
}