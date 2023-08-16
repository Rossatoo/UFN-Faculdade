package Projeto_final;

import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Socket s = new Socket("localhost", 1234);//CRIAÇÃO DE UM SOCKET CLIENTE E TENTATIVA DE CONEXAO NO IP "LOCALHOST" NA PORTA "1234"
			System.out.println("Conexão estabelecida com sucesso");
			
			DataOutputStream out = new DataOutputStream(s.getOutputStream());
			DataInputStream in = new DataInputStream(s.getInputStream());
			
			String codigo, resposta;
			int quantidade, opcao;
			
			do {
				System.out.println("----MENU----");
				System.out.println("1 - Vender Produto");
				System.out.println("2 - Sair");
				opcao = sc.nextInt();
		        sc.nextLine();
				
				switch (opcao) {
				case 1: 
					System.out.println("VENDA DE PRODUTO");
					System.out.println("Digite o Código do Produto: ");
					codigo = sc.nextLine();
					System.out.println("Digite a quantidade: ");
					quantidade = sc.nextInt();
					sc.nextLine();
					out.writeUTF(codigo);
					out.writeInt(quantidade);
					out.flush();
					System.out.println("Requisição enviada!");
					resposta = in.readUTF();
					System.out.println("" + resposta);
					
				break;
					
				case 2:
					s.close();
					System.out.println("Saindo do sistema...");
				break;
				}
				
			}while(opcao != 2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
