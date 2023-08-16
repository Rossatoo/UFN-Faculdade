#include <iostream>
#include <string>
#include<cstdlib>
#include <sstream>
#include <ctime>
#define TAM 10

using namespace std;

#include "util.h"

int main (){
    string nome;
    string email;

    cout << "Informe o nome completo: ";
    getline(cin, nome);

    nome = nome = paraMaiusculo(nome);
    string primeiroNome = pegarPrimeiroNome(nome);
    cout << primeiroNome << endl;
    
    //string sobreNome = pegarSobreNome(nome);
    return 1;
}