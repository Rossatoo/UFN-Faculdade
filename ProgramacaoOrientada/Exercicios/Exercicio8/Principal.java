package Exercicio8;

public class Principal {

	public static void main(String[] args) {
		Livro l = new Livro();
		
		l.nome = "The Walking Dead";
		l.preco = 25.00;
		l.descricao = "Mundo pos apocaliptico";
		System.out.println("Nome: "+l.getNome()+ "\nPreco: "+l.getPreco()+ "\nDescricao: "+l.getDescricao());
		
		System.out.println("-----------------------------------------");
		
		CD c = new CD();
		c.nome = "Leandro e Leonardo";
		c.preco = 10.00;
		c.descricao = "Sertanejo";
		System.out.println("Nome: "+c.nome+ "\nPreco: "+c.preco+ "\nDescricao: "+c.descricao);
	}

}
