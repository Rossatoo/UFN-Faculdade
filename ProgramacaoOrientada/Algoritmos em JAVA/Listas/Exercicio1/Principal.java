package Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Principal {

		public static void main(String[] args) {
			List<Produto> listaProdutos = new ArrayList<Produto>();
			
			Produto produto1 = new Produto("Caneta", 5.00, 2);
			Produto produto2 = new Produto("caderno", 25.00, 1);
			Produto produto3 = new Produto("estojo", 8.00, 1);
			
			listaProdutos.add(produto1);
			listaProdutos.add(produto2);
			listaProdutos.add(produto3);
			
			exibirProdutos(listaProdutos);

		}
		
		public static void exibirProdutos(List<Produto> lista) {
			for(Produto p : lista) {
				System.out.println("Nome: " + p.getNome());
				System.out.println("Preco: " + p.getPreco());
				System.out.println("Quantidade: " + p.getQuantidade());
				System.out.println("-------------------------");
			}
			}
		}

