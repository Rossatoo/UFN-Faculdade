package Exercicio3;

public class Principal {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Matheus", 20, "Ser Humano");
		
		System.out.println("Nome: "+p.nome);
		System.out.println("Idade: "+p.idade);
		System.out.println("Tipo: "+p.tipo);
		
		p.falar();
		p.andar();

	}

}
