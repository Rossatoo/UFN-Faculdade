//1) Faça um método que receba uma valor inteiro qualquer e que exiba se o valor passado no parâmetro é par ou ímpar.

#include <iostream>
#include <string>
#include <cstdlib>
#include <sstream>
#include <ctime>

using namespace std;

void parImpar(int v){   

        if (v % 2 == 0)
        {
            cout << v << " eh PAR" << endl;
        }

        else if (v % 2 == 1)
        {
            cout << v << " eh IMPAR" << endl;
        }       
}

int main (){
    int valor;

    cout << "Digite um valor inteiro: ";
    cin >> valor;

    parImpar(valor);

    return 1;
}