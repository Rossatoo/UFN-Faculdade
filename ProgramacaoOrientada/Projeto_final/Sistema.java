package Projeto_final;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Sistema extends Produto{
	public Sistema(String codigo, String descricao, double precoCusto, double precoVenda, int estoque) {
		super(codigo, descricao, precoCusto, precoVenda, estoque);
	}

	public void exibirMenu() {
		Scanner sc = new Scanner(System.in);
		List<Produto> produtos = new ArrayList<>();
		
        int opcao;
        leArquivo(produtos); //ler os dados que estao no arquivo e adicionar na lista assim que inicia o programa
        exibirListaProdutos(produtos);
        do {        	
        	
            System.out.println("----- MENU -----");
            System.out.println("0 - Iniciar o Servidor");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Alterar preço do produto");
            System.out.println("3 - Excluir produto");
            System.out.println("4 - Sair do sistema");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
            
            	case 0:
            		try {
            			ServerSocket servidor = new ServerSocket(1234); //CRIAÇÃO DO SOCLET E DEFINIÇÃO DA PORTA
            			System.out.println("Socket servidor criado com sucesso");
            			Socket cliente = servidor.accept();
            			
            			while(true) {
            				
            				
            				DataOutputStream out = new DataOutputStream(cliente.getOutputStream());
            				DataInputStream in = new DataInputStream(cliente.getInputStream());
            				
            				boolean encontrei = false;
            				String codigoC, resposta = ""; //CODIGO RECEBIDO DO CLIENTE
            				int quantidadeC; //QUANTIDADE RECEBIDA DO CLIENTE
            				codigoC = in.readUTF();
            				quantidadeC = in.readInt();
            				System.out.println("Recebi o código: " + codigoC + " e a quantidade: " + quantidadeC);
            				
            				
            				Iterator<Produto> iter = produtos.iterator();
            				while(iter.hasNext()) {
            					Produto p = iter.next();
            					if(codigoC.equals(p.getCodigo())) {
            						encontrei = true;
            						if(p.getEstoque() - quantidadeC >= 0) {
            							p.venda(quantidadeC);
            							System.out.println("Venda Realizada");
            							resposta = "Produto vendido";
            								
            						}
            						
            						else {
            							System.out.println("Produto sem estoque");
            							resposta = "Produto sem estoque";
            						}
            						
            					}
            					
            					if (encontrei == false)
            						resposta = "Produto nao localizado";
            					
            				}
            				out.writeUTF(resposta);
            				
            				
            			}
            		} catch (Exception ex) {
            			ex.printStackTrace();
            	}
            	
            	break;
            	
            		
                case 1:
                	//CADASTRANDO NOVO PRODUTO
                	System.out.println("Opção 1 - Cadastrar produto");
        	        
        	        System.out.print("Digite o Código do Produto: ");
        	        codigo = sc.nextLine();
        	       

        	        System.out.print("Digite a Descrição do Produto: ");
        	        descricao = sc.nextLine();

        	        System.out.print("Digite o Preço de venda: ");
        	        precoVenda = sc.nextDouble();

        	        System.out.print("Digite o Preço de custo: ");
        	        precoCusto = sc.nextDouble();

        	        System.out.print("Digite a Qtd em Estoque do Produto: ");
        	        estoque = sc.nextInt();

        	        Produto novoProduto = new Produto(codigo, descricao, precoVenda, precoCusto, estoque);
        	        produtos.add(novoProduto);

        	        System.out.println("Produto cadastrado com sucesso!");
        	        
                break;
                    
                    
                case 2:
                	//ALTERANDO PRECO DO PRODUTO
                    System.out.println("Opção 2 - Alterar Preço Produto");
                    System.out.println("Digite o Código do Produto que deseja alterar o preço: ");
                    String codigoA = sc.nextLine();
                    boolean prodEncontrado  = false;
                    double novoPrecoVenda;
                    
                    Iterator<Produto> it = produtos.iterator();
                    while(it.hasNext()) {
                    Produto prod = it.next();
                    	if(codigoA.equals(prod.getCodigo())) {
                    		System.out.println("Produto localizado. Digite o novo preco de venda do produto: ");
                    		novoPrecoVenda = sc.nextDouble();
                    		
                    		prod.setPrecoVenda(novoPrecoVenda);
                    		prodEncontrado = true;
                    		System.out.println("Preco alterado com sucesso!");
                    		break;
                    	}
                    }
                    
                    if(!prodEncontrado) {
                    	System.out.println("Produto não localizado!");
                    }
                    
                break;
                
                case 3:
                	  //EXCLUINDO UM PRODUTO
					  System.out.println("OpÃ§Ã£o 3 - Excluir Produto");
					  System.out.println("Digite o Código do Produto que deseja excluir: ");
					  String codigoE = sc.nextLine();
					  boolean produtoEncontrado = false;
					  
					  Iterator<Produto> iterator = produtos.iterator();
					  while (iterator.hasNext()) {
					  Produto produto = iterator.next();
						  
						  	if (codigoE.equals(produto.getCodigo())) {
						  		iterator.remove();
						  		produtoEncontrado = true;
						  		System.out.println("Produto removido com sucesso!"); 
						  		break; 
						  		}
						  	}
					  
					  if(!produtoEncontrado) {
						  System.out.println("Produto nao localizado!");
					  }
					 
                break;                
                
                case 4:
                    System.out.println("Saindo do sistema...");
                break;
                    
                default:
                    System.out.println("OpÃ§Ã£o Invalida!!");
                break;
            }

            System.out.println();
            
            gravaArquivo(produtos);
            exibirListaProdutos(produtos);
        } while (opcao != 4);
        
	}
	 
	//ADICIONANDO OS DADOS DO NOVO PRODUTO NA LISTA "PRODUTOS"
	public void exibirListaProdutos(List<Produto> lista) { 
        System.out.println("Lista de Produtos:");
        for (Produto produto : lista) {
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Preço de Venda: " + produto.getPrecoVenda());
            System.out.println("Preço de Custo: " + produto.getPrecoCusto());
            System.out.println("Estoque: " + produto.getEstoque());
            System.out.println("-----------------------");
        }
    
	}
	
	//METODO PARA ADICIONAR OS DADOS DA LISTA EM UM ARQUIVO
	public void gravaArquivo(List<Produto> lista) {
		try {
			FileWriter arquivo = new FileWriter("Produtos.txt");
			BufferedWriter escritor = new BufferedWriter(arquivo);
			for(Produto produto : lista) {
				escritor.write(produto.getCodigo() + ";" + produto.getDescricao() + ";" + produto.getPrecoVenda() + ";" + produto.getPrecoCusto() + ";" + produto.getEstoque());
				escritor.newLine();
				
		}
			escritor.close();
			arquivo.close();
			System.out.println("Dados dos produtos salvos no arquivo Produtos.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	//METODO PARA LER O DADOS DO ARQUIVO E ADICIONAR NA LISTA
	public List<Produto> leArquivo(List<Produto> produtos){
		System.out.println("Alunos lidos do arquivo: ");
		try {
			FileReader arquivo = new FileReader("Produtos.txt");
			BufferedReader leitor = new BufferedReader(arquivo);
			
			System.out.println("Dados lidos do arquivo");
			String linha;
			while((linha = leitor.readLine()) != null) {
				String[] campos = linha.split(";");
				
				String codigo = campos[0];
				String descricao = campos[1];
				double precoVenda = Double.parseDouble(campos[2]);
				double precoCusto = Double.parseDouble(campos[3]);
				int estoque = Integer.parseInt(campos[4]);			
				
				Produto produto = new Produto(codigo, descricao, precoVenda, precoCusto, estoque);
				produtos.add(produto);
			}
			
			leitor.close();
			arquivo.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		return produtos;
	}
}
