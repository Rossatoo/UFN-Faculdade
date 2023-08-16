 /**
 * 3 - Escreva um algoritmo para calcular o reajuste salarial de uma empresa que possui 1000 
 * funcionários, de acordo com os seguintes critérios:
 *	• os funcionários com salário inferior a 10.000 devem receber 55% de reajuste
 *	• os funcionários com salário entre 10.000 e 25.000 devem receber 30% de reajuste.
 *	• os funcionários com salário acima de 25.000 devem receber 20% de reajuste.
 */ 

#include <iostream>
#define TAM 1000
using namespace std;

int main (){
    float salarioFuncionario[TAM], reajuste;

    for (int i = 0; i < TAM; i++)
    {
        cout << "Digite o salario do funcionario " << (i + 1) << ": ";
        cin >> salarioFuncionario[i];

        if (salarioFuncionario[i] < 10000)
        {
            // salarioFuncionario - 100%
            //      reajuste      -  55%
            reajuste = (salarioFuncionario[i] * 55) / 100;

            cout << "O reajuste eh de: " << reajuste << endl;
            cout << "O novo salario eh: " << (salarioFuncionario[i] + reajuste) << endl;
        }

        else if (salarioFuncionario[i] >= 10000 && salarioFuncionario[i] < 25000)
        {
            // salarioFuncionario - 100%
            //      reajuste      - 30%
            reajuste = (salarioFuncionario[i] * 30) / 100;

            cout << "O reajuste eh de: " << reajuste << endl;
            cout << "O novo salario eh: " << (salarioFuncionario[i] + reajuste) << endl;
        }

        else { 
            // salarioFuncionario - 100%
            //      reajuste      - 20%
            reajuste = (salarioFuncionario[i] * 20) / 100;

            cout << "O reajuste eh de: " << reajuste << endl;
            cout << "O novo salario eh: " << (salarioFuncionario[i] + reajuste) << endl; } 
        
        }
    


    return 0;
}