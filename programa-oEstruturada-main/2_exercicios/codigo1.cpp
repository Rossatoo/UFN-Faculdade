/*Escrever um algoritmo que lê o código de um vendedor de uma empresa, 
 * seu salário fixo e o total de vendas efetuadas por ele. 
 * Cada vendedor recebe um salário fixo, mais uma comissão proporcional 
 * às vendas efetuadas por ele. A comissão é de 3% sobre o total de 
 * vendas até R$1.000,00; 5% de R$1.000,00 à R$2.000,00 e 10% para 
 * vendas acima de R$2.000,00. Escrever o código do vendedor, o total 
 * de suas vendas, seu salário fixo e seu salário total. */

#include <iostream>
#define TAM 5
using namespace std;

typedef struct {
  int codigo;
  float salarioFixo;
  float totalVendas;
  float comissao;
  float salarioTotal;
} Vendedor; //tipo artificial criado pelo programador

int main() {
  Vendedor vetor[TAM];   

  for (int i = 0; i < TAM; i++) {
    cout << "Digite codigo do vendedor " << (i+1) << ": ";
    cin >> vetor[i].codigo;

    cout << "Salario fixo: ";
    cin >> vetor[i].salarioFixo;

    cout << "Total de vendas: ";
    cin >> vetor[i].totalVendas;

    if (vetor[i].totalVendas <= 1000) {
        //totalVendas - 100
        //comissao    - 3
        vetor[i].comissao = (vetor[i].totalVendas * 3 / 100) + vetor[i].totalVendas;
    } else if (vetor[i].totalVendas <= 2000) {
        //totalVendas - 100
        //comissao    - 5
        vetor[i].comissao = (vetor[i].totalVendas * 5 / 100) + vetor[i].totalVendas;
    } else {
        //totalVendas - 100
        //comissao    - 10
        vetor[i].comissao = (vetor[i].totalVendas * 10 / 100) + vetor[i].totalVendas;
    }

    vetor[i].salarioTotal = vetor[i].salarioFixo + vetor[i].comissao;
    cout << "Seu salário total é: " << vetor[i].salarioTotal << endl;
  }

  cout << "Exibindo vendedores: \n";
  for (int i = 0; i < TAM; i++) {
    cout << "Codigo do vendedor " << (i+1) << vetor[i].codigo;
    cout << "Salario fixo: " << vetor[i].salarioFixo;
    cout << "Total de vendas: " << vetor[i].totalVendas;
    cout << "Salario total: " << vetor[i].salarioTotal << endl;
    cout << "_____________________________\n";
  }

  return 0;
}