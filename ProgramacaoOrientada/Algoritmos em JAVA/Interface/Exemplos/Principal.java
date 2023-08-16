package Exemplos;

public class Principal {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		cachorro.emitirSom();
		cachorro.cuidarPatio();
		cachorro.nome = "Wolly";
		cachorro.idade = 7;
		cachorro.exibeDados();
		System.out.println("--------------------");
		
		Gato gato = new Gato();
		gato.emitirSom();
		gato.nome = "Mimi";
		gato.idade = 6;
		gato.exibeDados();

	}

}
