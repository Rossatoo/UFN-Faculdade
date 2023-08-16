package Loja;

public class Produto {
	public int codigo, estoque;
	public String descricao;
	public float precoCusto, precoVenda;
	
	public Produto(int codigoP, int estoqueP, String descricaoP, float precoCustoP, float precoVendaP) {
		codigo = codigoP;
		estoque = estoqueP;
		descricao = descricaoP;
		precoCusto = precoCustoP;
		precoVenda = precoVendaP;
	}
	
	public void vendeProduto(int qtdVendida) {
		estoque = estoque - qtdVendida;
	}
	
	public void baixaEstoque(int qtdBaixa, int valor) {
		estoque = estoque - qtdBaixa;
		
		if(valor == 1) {
			System.out.println("Motivo da baixa: ROUBO");
		}
		
		else if(valor == 2) {
			System.out.println("Motivo da baixa: PERDA/QUEBRA");
		}	
		else if(valor == 3) {
			System.out.println("Motivo da baixa: OUTRO");
		}
		
	}
	
	public int retornaEstoque() {
		return estoque;
	}
	
	public void entraEstoque(int qtdEntrada) {
		estoque = estoque + qtdEntrada;
	}
}
