package Exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		
		listaPessoas.add(new Pessoa("Adriana", 44, 'F'));
		listaPessoas.add(new Pessoa("Matheus", 20, 'M'));
		listaPessoas.add(new Pessoa("Bibiana", 21, 'F'));
		
		contaMulheres(listaPessoas);
			
	}
	
	public static void contaMulheres(List<Pessoa> lista) {
		int cont = 0;
		for(Pessoa p : lista) {
			if(p.getSexo() == 'F') {
				cont ++;
			}
		}
		System.out.println("Quantidade de Mulheres: " +cont);
	}
}
