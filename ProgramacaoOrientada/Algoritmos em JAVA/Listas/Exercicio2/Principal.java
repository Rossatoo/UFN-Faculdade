package Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		
		listaAlunos.add(new Aluno("Matheus", 5.00, 10.00));
		listaAlunos.add(new Aluno("Eric", 5.00, 2.00));
		listaAlunos.add(new Aluno("Leo", 7.00, 10.00));
		
		exibirAlunos(listaAlunos);
	}
	
	public static void exibirAlunos(List<Aluno> lista) {
		for(Aluno a : lista) {
			System.out.println("Nome: " + a.getNome() + "\t Nota 1: " + a.getNota1() + "\t Nota 2: " + a.getNota2());
		
			if(calcularMedia(a.getNota1(), a.getNota2()) >= 6) {
				System.out.println("Aprovado!! \n --------------");
			}else 
			System.out.println("Reprovado!! \n ---------------");
		}
	}
	
	public static double calcularMedia(double a, double b) {
		return (a + b)/2;
	}
}
