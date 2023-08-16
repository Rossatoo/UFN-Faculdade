/**
 * 4 - Faça um programa que leia uma palavra qualquer e depois mostre apenas as vogais.
 */ 

#include <iostream>
#include <string>
using namespace std;

int main () {
    int cont=0;
    char vogais[5];
    string palavra;

    cout << "Digite uma palavra: ";
    cin >> palavra;

    for (int i = 0; i < palavra.length(); i++)
    {
        if (palavra[i] == 'a' ||
            palavra[i] == 'e' ||
            palavra[i] == 'i' ||
            palavra[i] == 'o' ||
            palavra[i] == 'u')
        {
            vogais[cont++] = palavra[i];
        }
        
    }
    
    for (int i = 0; i < 5; i++)
    {
        cout << vogais[i];
    }
    

    return 0;
}