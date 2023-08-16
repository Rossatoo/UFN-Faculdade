package Loja;

import java.util.Scanner;

public class PontoDeVenda {	
	
	public static void main(String[] args) {
		int codigo, estoque, opcao;
		String descricao;
		float precoCusto, precoVenda;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o codigo do produto: ");
		codigo = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Entre com o estoque do produto: ");
		estoque = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Entre com a descricao do produto: ");
		descricao = sc.nextLine();
		
		System.out.println("Entre com o preco de custo do produto: ");
		precoCusto = sc.nextFloat();
		sc.nextLine();
		
		System.out.println("Entre com o preco de venda do produto: ");
		precoVenda = sc.nextFloat();
		sc.nextLine();
		
		Produto p = new Produto(codigo, estoque, descricao, precoCusto, precoVenda);
		
		
		do {
		System.out.println("---MENU---");
		System.out.println("1 - Venda de Produto");
		System.out.println("2 - Entra Estoque");
		System.out.println("3 - Baixa Estoque");
		System.out.println("4 - Retorna Estoque");
		System.out.println("0 - Sair");
		System.out.println("Escolha a opcao desejada: ");
		opcao = sc.nextInt();
		
		switch(opcao) {
		
		case 1:
			System.out.println("Digite a quantidade que foi vendida: ");
			int qtdVendida = sc.nextInt();
			sc.nextLine();
			
			p.vendeProduto(qtdVendida);
			break;
			
		case 2:
			System.out.println("Digite a quantidade de entrada no estoque: ");
			int qtdEntrada = sc.nextInt();
			sc.nextLine();
			
			p.entraEstoque(qtdEntrada);
			break;
			
		case 3: 
			System.out.println("Digite a quantidade de baixa no estoque: ");
			int qtdBaixa = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Escolha o motivo da baixa:\n 1 - Roubo\n 2 - Perda/Quebra\n 3 - Outro");
			int valor = sc.nextInt();
			
			p.baixaEstoque(qtdBaixa, valor);
			break;			
			
		case 4:
			p.retornaEstoque();
			System.out.println("Estoque: "+p.estoque);
			break;
			
		case 0:
			System.out.println("Obrigado por usar o sistema!!");
			break;
			
		default:
			System.out.println("Opcao invalida!!");
			break;
		}
		
		
			
		}while(opcao != 0);
	}

}
