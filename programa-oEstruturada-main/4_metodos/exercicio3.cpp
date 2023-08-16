// 3) Faça um método que receba dois valores inteiros e escreva na tela se o primeiro parâmetro é ou não múltiplo do segundo 

#include <iostream>
#include <cstdlib>
#include <string>
#include <sstream>
#include <ctime>

using namespace std;

void verificaMultiplo(int v, int v2){
    if (v % v2 == 0)
    {
        cout << v << "eh multiplo de " << v2 << endl;
    }   else{
        cout << v << "nao eh multiplo de " << v2 << endl;
    }  
}

int main() {
    int valor1, valor2;

        cout << "Entre com o primeiro valor: ";
        cin >> valor1;

        cout << "Entre com o segundo valor: ";
        cin >> valor2;

        verificaMultiplo(valor1, valor2);
    return 1;
}