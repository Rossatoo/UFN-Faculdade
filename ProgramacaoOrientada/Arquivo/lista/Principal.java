package lista;

import java.util.ArrayList;
import java.util.List;


public class Principal {

	public static void main(String[] args) {
		//Criando objetos Aluno
		Aluno aluno1 = new Aluno("João", 20);
		Aluno aluno2 = new Aluno("Maria", 22);
		Aluno aluno3 = new Aluno("Alziras", 19);
		
		List<Aluno> lista = new ArrayList<>();
		
		Arquivo arquivo = new Arquivo("alunos");
		arquivo.gravaArquivo(aluno1);
		arquivo.gravaArquivo(aluno2);
		arquivo.gravaArquivo(aluno3);

		lista = arquivo.leArquivo();
		
		for(Aluno a : lista) {
			System.out.println("Nome: " + a.getNome() + ", Idade: " + a.getIdade());
		}
	}

}
