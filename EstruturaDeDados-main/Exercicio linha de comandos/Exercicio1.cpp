#include <iostream>
#include <string>
#include <cstdlib>
#include <sstream>
#include <ctime>
#include <fstream>

using namespace std;

#include "pilha.h"

int main(){
    ifstream procurador;

    Celula *pilha = NULL;
    string nomeArquivo = "Comandos.txt";

    procurador.open(nomeArquivo);

    int valor;
    string linha; //variavel que vai receber o que esta escrito em cada linha do arquivo
    int num; //varaivel que vai receber os caracteres da variavel "linha" convertidos para inteiro
    do
    {
        getline(procurador, linha); //lendo o que esta escrito na linha do arquivo

        if(linha == "") break; //Se a linha estiver em branco o programa ira parar

        if (linha[0] == 'I')
        {
            linha = linha.substr(1, 40); //pegando os caracteres do arquivos apos a linha I
            num = stoi(linha);//convertendo os caracteres para inteiro
            pilha = inserir(num, pilha);
        }

        else if (linha[0] == 'E')
        {
            cout << "Exibindo pilha de comandos" << endl;
            exibir(pilha);
        }

        else {
            pilha = remover(pilha);
        }
        
        
    } while (!procurador.eof());
    procurador.close(); 

    return 1;
}