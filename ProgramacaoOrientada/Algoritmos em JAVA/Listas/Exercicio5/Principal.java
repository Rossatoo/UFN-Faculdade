package Exercicio5;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Conta> listaContas = new ArrayList<Conta>();
		
		listaContas.add(new Conta(1, "Matheus", 125.35));
		listaContas.add(new Conta(2, "Ricardo", 50135.25));
		listaContas.add(new Conta(2, "Eduardo", 135.25));
		
		exibirConta(listaContas);
	}
	
	public static void exibirConta(List<Conta> lista) {
		double maior = lista.get(0).getSaldo();
		int indMaior = 0;
		//for(Conta c : lista) {
		for(int i=0;i<lista.size();i++)
			if(lista.get(i).getSaldo() > maior) {
				//maior = c.getSaldo();
				indMaior = i;
				
			//}
		}
		System.out.println("Numero da conta: " + lista.get(indMaior).getNumero());
		System.out.println("Titular da conta: " + lista.get(indMaior).getTitular());
		System.out.println("Saldo da conta: " + lista.get(indMaior).getSaldo());
		/*
		for (Conta c : lista) {
			if(c.getSaldo() == maior) { 
					System.out.println("Numero da conta: " + c.getNumero());
					System.out.println("Titular da conta: " + c.getTitular());
					System.out.println("Saldo da conta: " + c.getSaldo());
			}
		}*/
	}
}

