#include <iostream>
#include <string>
#include<cstdlib>
#define TAM 10

using namespace std;

typedef struct 
{
    string placa;
    string data;
    string horaEntrada;
    string horaSaida;
    int tempoPermanencia;
    float valor;    
} Garagem;

int main (){
    Garagem vagas[TAM];
    int opcao;
    int totalVeiculos = 0;

    do
    {
        system("cls");
        cout << "Menu Garagem\n";
        cout << "1 - Entrada de veiculo\n";
        cout << "2 - Saida de veiculo\n";
        cout << "3 - Listar veiculos da garagem\n";
        cout << "4 - Sair\n";
        cout << "Opcao; ";
        cin >> opcao;

        switch (opcao)
        {
        case 1:
            cout << "Entrando veiculo...\n";
            break;

        case 2:
            cout << "Saindo veiculo...\n";
            break;
        
        case 3:
            cout << "Listando veiculos...\n";
            break;

        case 4:
            cout << "Obrigado por usar o sistema!\n";
            break;

        default:
            cout << "Opcao invalida!";
            break;
        }

        system("pause");
    } while (opcao != 4);
    

    return 1;
}