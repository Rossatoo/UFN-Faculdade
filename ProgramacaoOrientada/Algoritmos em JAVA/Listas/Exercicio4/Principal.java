package Exercicio4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Livro> listaLivros = new ArrayList<Livro>();
		
		listaLivros.add(new Livro("The Walking Dead", "Roberto", 2014));
		listaLivros.add(new Livro("Senhor dos Aneis", "LIndomar", 2007));
		listaLivros.add(new Livro("Barbie", "Mulan", 2019));
		
		listaLivros.sort(Comparator.comparing(Livro::getAno));
		
		exibirLivros(listaLivros);
	}
	public static void exibirLivros(List<Livro> lista) {
		for(Livro l : lista) {			
			System.out.println("Titulo: " + l.getTitulo());
			System.out.println("Autor: " + l.getAutor());
			System.out.println("Ano: " + l.getAno());
			System.out.println("-------------------");
		}
	}
}
