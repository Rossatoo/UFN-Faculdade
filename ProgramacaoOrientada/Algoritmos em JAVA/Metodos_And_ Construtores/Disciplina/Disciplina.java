package Disciplina;

public class Disciplina {
	public String nomeDisciplina, nomeProfessor;
	public double cargaHoraria;
	
	public void atribuirValores(String nomeD, String nomeP, double cargaH) {
		nomeDisciplina = nomeD;
		nomeProfessor = nomeP;
		cargaHoraria = cargaH;
	}
	
	public String retornaNomeD() {
		return nomeDisciplina;
	}
	public String retornaNomeP() {
		return nomeProfessor;
	}
	public double retornaCargaH() {
		return cargaHoraria;
	}
}
