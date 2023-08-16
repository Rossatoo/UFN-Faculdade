#include <iostream>
#include <string>
#include <cstdlib>
#include <sstream>
#define TAM 10

using namespace std;

typedef struct 
{
    string placa;
    string data;
    string horaE;
    string horaS;
    int tempoPermanencia;
    float valor;    
} Garagem;

int main (){
    Garagem vagas[TAM];
    int opcao;
    int totalVeiculos = 0;
    string horarioEntradaHora;
    string horarioEntradaMinutos;
    string horarioSaidaMinutos;
    string horarioSaidaHora;
    int horaEntradaMinutos;
    int horaSaidaMinutos;
    string placaV;

    do  //Menu do sistema
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
        case 1: // se o usuario escolher 1, fara a entrada de um veiculo na garagem com a obtenção das informações
            cout << "Entrando veiculo...\n";
                if (totalVeiculos == TAM) // se o total de veiculos for igual ao maximo do vetor a garagem esta lotada
                {
                    cout << "Garagem lotada!";
                }

                else
                {
                    cout << "Informe a placa do veiculo: ";
                    cin >> vagas[totalVeiculos].placa;

                    do
                    {
                        cout << "Informe a data: [dd/mm/aaaa]";
                        cin >> vagas[totalVeiculos].data;
                    } while (vagas[totalVeiculos].data.length() != 10);

                    do
                    {
                        cout << "Informe a hora de entrada: [hh:mm]";
                        cin >> vagas[totalVeiculos].horaE;

                    } while (vagas[totalVeiculos].horaE.length() != 5);
                    totalVeiculos++;
                }
                
            break;

        case 2:
            cout << "Saindo veiculo...\n";
                if (totalVeiculos == 0) 
                {
                    cout << "Garagem vazia\n";
                }

                else{
                    cout << "Informe a placa do veiculo que esta saindo: ";
                    cin >> placaV;

                    for (int i = 0; i <= totalVeiculos; i++)
                    {
                        if (placaV == vagas[i].placa)
                        {
                            cout << "Digite a hora de saida do veiculo: [hh:mm]";
                            cin >> vagas[i].horaS;

                            horarioEntradaHora = vagas[i].horaE.substr(0,2);
                            horarioEntradaMinutos = vagas[i].horaS.substr(3,2);

                            horarioSaidaHora = vagas[i].horaS.substr(0,2);
                            horarioSaidaMinutos = vagas[i].horaS.substr(3,2);

                            horaEntradaMinutos = stoi(horarioEntradaHora) * 60 + stoi(horarioEntradaMinutos);
                            horaSaidaMinutos = stoi(horarioSaidaHora) * 60 + stoi(horarioSaidaMinutos);

                            vagas[i].tempoPermanencia = horaSaidaMinutos - horaEntradaMinutos;
                            cout << "Tempo de Permanencia: " << vagas[i].tempoPermanencia << "minutos";

                            if (vagas[i].tempoPermanencia <= 60)
                            {
                                vagas[i].valor = 10;
                                cout << vagas[i].valor;
                            }

                            else if (vagas[i].tempoPermanencia > 60 && vagas[i].tempoPermanencia <= 120)
                            {
                                vagas[i].valor = 10 * 2;
                                cout << vagas[i].valor;
                            }

                            
                            else if (vagas[i].tempoPermanencia > 120 && vagas[i].tempoPermanencia <= 180)
                            {
                                vagas[i].valor = 10 * 3;
                                cout << vagas[i].valor;
                            }
                            
                            
                            else if (vagas[i].tempoPermanencia > 180 && vagas[i].tempoPermanencia <= 240)
                            {
                                vagas[i].valor = 10 * 4;
                                cout << vagas[i].valor;
                            }

                            
                            else if (vagas[i].tempoPermanencia > 240)
                            {
                                vagas[i].valor = 10 * 5;
                                cout << vagas[i].valor;
                            }

                        }
                        
                    }
                    
                }
            break;
        
        case 3:
            cout << "Listando veiculos...\n";
                if (totalVeiculos == 0) 
                {
                    cout << "Garagem vazia\n";
                }
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