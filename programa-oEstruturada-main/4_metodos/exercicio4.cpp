//4) Faça um método que receba um número inteiro entre 1 a 10 e o escreva em romanos.

#include <iostream>
#include <cstdlib>
#include <string>
#include <sstream>
#include <ctime>

using namespace std;

void numeroRomano(int valor){
    switch (valor)
    {
    case 1:
        cout << "Em romano = I";
        break;
    
    case 2:
        cout << "Em romano = II";
        break;

    case 3:
        cout << "Em romano = III";
        break;

    case 4:
        cout << "Em romano = IV";
        break;

    case 5:
        cout << "Em romano = V";
        break;

    case 6:
        cout << "Em romano = VI";
        break;

    case 7:
        cout << "Em romano = VII";
        break;

    case 8:
        cout << "Em romano = VIII";
        break;

    case 9:
        cout << "Em romano = IX";
        break;

    case 10:
        cout << "Em romano = X";
        break;
    
    default:
        cout << "Digite um numero entre 1 e 10!!";
        break;
    }
    
}
int main(){
    int valor;

    cout << "Entre com um numero de 1 a 10: ";
    cin >> valor;
    numeroRomano(valor);
    return 1;
}