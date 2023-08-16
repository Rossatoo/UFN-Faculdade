//2) Fazer um programa em C++, que recebe o vetor populado e exibido no código anterior, fazendo a operação de ordenação no vetor. Ao final, mostrar o vetor ordenado.
#include <iostream>
#include <ctime>
#include <cstdlib>

using namespace std;

int main() {

    //Populando o vetor
    int vetor[10];
    srand(time(NULL));
    
    cout << "Valores do vetor \n";
    for(int i = 0; i < 10; i++){
        vetor[i] = rand() % 100;
    }
    //Exibindo o vetor
    for(int i = 0; i < 10; i++){
        cout << vetor[i] << "\t";
    }

    //ordenando o vetor pelo metodo Bubble sort (bolha)
    bool houveTroca;
    int temp;
    do
    {
        houveTroca = false;
        for (int i = 0; i < 10; i++)
        {
            if (vetor[i] > vetor[i+1])
            {
                temp = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = temp;
                houveTroca = true; 
            }
            
        }
        
    } while (houveTroca);

    //Exibindo os valores ordenados
    cout << "\nValores ordenados no vetor\n";
    for (int i = 0; i < 10; i++) {
    cout << vetor[i] << "\t";
  }
  cout << endl;
    
    return 1;
}