package Aluno;

public class Aluno {
	public String nome, dataNasc;
	public int matricula, anoInicial;
	
	public Aluno(String nomeA, int matriculaA) {
		nome = nomeA;
		matricula = matriculaA;
	}
	
	public Aluno(String dataNascA) {
		dataNasc = dataNascA;
	}
	
	public Aluno(String nomeA, String dataNascA, int anoInicialA) {
		nome = nomeA;
		dataNasc = dataNascA;
		anoInicial = anoInicialA;
	}
}
