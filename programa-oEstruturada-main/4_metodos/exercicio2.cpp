// 2) Faça um método que receba uma frase qualquer e exiba caracter por caracter, um abaixo do outro.


#include <iostream>
#include <string>
#include <cstdlib>
#include <sstream>
#include <ctime>

using namespace std;

void quebraLinha(string frase){
    for (int i = 0; i < frase.length(); i++)
    {
        cout << frase[i] << endl;
    }
    
}

int main (){
    string frase;

    cout << "Entre com uma frase: ";
    getline(cin, frase);

    quebraLinha(frase);

    return 1;
}