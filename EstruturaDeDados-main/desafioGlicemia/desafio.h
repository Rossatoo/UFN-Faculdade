typedef struct no {
    int valor;
    string data;
    int qtdOcorrencias;
    struct no *prox;
} Celula;

Celula *inserirOrdenado(string linha, Celula *lista) {
    // alocar memória
  Celula *novo = (Celula *)calloc(1,sizeof(Celula));
  Celula *p, *pR;
  int valor;
  string data;
 
  valor = stoi(linha.substr(linha.find(" "),200));             
  data = linha.substr(0,linha.find(" "));


  // depositar valores
  novo->data = data;
  novo->valor = valor;
  novo->qtdOcorrencias = 1;
  novo->prox = NULL;

  // para a primeira alocação
  if (!lista) return novo;
  
  for(pR = NULL, p = lista; p ; pR = p, p = p->prox){
        if(valor < p->valor){
            break;
        }
  }

  // no inicio
  if (p == lista) {
    novo->prox = lista;
    return novo;
  }
  // no fim
  if (!p) {
    pR->prox = novo;
    return lista;
  }
  // no meio
  pR->prox = novo;
  novo->prox = p;
  return lista;

}

void exibirListaSimples(Celula *lista) {
    if (!lista) 
    return;

    Celula *p;
    int i = 1;
    for (p = lista; p; i++, p = p->prox) {
        cout << i << ": "<< p->data << " " << p->valor << endl;
    }
    cout << endl;
}


Celula *inserirControleDuplicado(int valor, string data, Celula *lista) {
     //alocar memória
    Celula *novo = (Celula *)calloc(1,sizeof(Celula));
    Celula *p, *pR;

    //depositar valores
    novo->data = data;
    novo->valor = valor;
    novo->qtdOcorrencias = 1;
    novo->prox = NULL;

    //para a primeira alocação
    if (!lista) return novo;

    //definir a posicao do valor na lista, ou seja, percorrer a lista
    for (pR = NULL, p = lista; p ; pR = p, p = p->prox) {
        if (valor == p->valor) {
            p->qtdOcorrencias++;
            free(novo);
            return lista;
        }
        
        if (valor < p->valor) {
            break;
        }
    }
    //no inicio
    if (p == lista) {
        novo->prox = lista;
        return novo;
    }
    //no fim
    if (!p) {
        pR->prox = novo;
        return lista;
    }
    //no meio
    pR->prox = novo;
    novo->prox = p;
    return lista;
}

Celula *copiaListaControleDuplicidade(Celula *lista) {
    Celula *listaNova = NULL;
    Celula *p;

    for (p = lista; p; p = p->prox) {
        listaNova = inserirControleDuplicado(p->valor, p->data, listaNova);
    }
    return listaNova;
}

Celula *ordenarPelasOcorrencias(Celula *lista) {
    //usando o método da bolha ou bubble sort
    Celula *tmp = (Celula*)calloc(1,sizeof(Celula));
    Celula *p;
    bool houveTroca;

    do {
        houveTroca = false;
        for (p = lista; p->prox; p = p->prox) {
            if (p->qtdOcorrencias < p->prox->qtdOcorrencias) {
                houveTroca = true;

                tmp->valor = p->valor;
                tmp->data = p->data;
                tmp->qtdOcorrencias = p->qtdOcorrencias;

                p->valor = p->prox->valor;
                p->data = p->prox->data;
                p->qtdOcorrencias = p->prox->qtdOcorrencias;

                p->prox->valor = tmp->valor;
                p->prox->data = tmp->data;
                p->prox->qtdOcorrencias = tmp->qtdOcorrencias;
            }
        }
    } while (houveTroca);
    free(tmp);
    return lista;
}

void exibirOcorrencias(Celula *lista) {
    Celula *p;
    int i = 1;
    for (p = lista; p; i++, p = p->prox) {
        cout << i << "o " << p->valor << " - " << p->qtdOcorrencias << endl;
    }
}


int contarElementos(Celula *lista) {
    int qtd = 0;
    Celula *p;
    for (p = lista; p; p = p->prox) {
        qtd++;
    }
    return qtd;
}

float media(Celula *lista) {
    Celula *p;
    int soma = 0;
    float media;
    for(p = lista; p; p = p->prox){
        soma = soma + p->valor;
    }
    media = soma / contarElementos(lista);
    return media;
}

int mediana(Celula *lista) {
     int quantidade = contarElementos(lista);
    Celula *p;
    int i;
    for (i = 1, p = lista; i < quantidade / 2; i++, p = p->prox); //achar o valor do meio da lista ordenada

    //se a estrutura for de tamanho impar, devolver o valor da glicemia que está no meio da lista ordenada
    if (quantidade % 2 != 0) {
        return p->valor;
    }

    //se for par retorna a media dos dois valores que estao ao centro       
    return (int)(p->valor + p->prox->valor)/2;
}

int min(Celula *lista) {
    Celula *p;
    int menor = lista->valor;
    for (p = lista; p; p = p->prox) {
        if(p->valor < menor){
            menor = p->valor;
        }
        }
        return menor; 
    }


int max(Celula *lista) {
     Celula *p;
    int maior = lista->valor;
    for (p = lista; p; p = p->prox) {
        if(p->valor > maior){
            maior = p->valor;
        }
        }
        return maior; 
}

Celula *moda(Celula *lista) {
  //retornar o valor que mais repete, se houver mais valores com a mesma quantidade, retornar 3 valores
    Celula *p;
    int i = 1;
    int maior =lista->qtdOcorrencias;
    for (p = lista; i<4;p = p->prox, i++) {
        if(p->qtdOcorrencias < maior) break;
        cout << "Valor: " <<p->valor << " - Ocorrencias:" << p->qtdOcorrencias << endl;
    }
}


