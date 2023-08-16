package Exemplos;

public class Principal {

	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		c.emiteSom();
		c.especie = "Canis Lupus Familiaris";
		c.idade = 18;
		c.raca = "Pinscher";
		c.exibeDados();
		c.cuidarPatio();
		System.out.println("-----------------------");
		
		Animal c2 = new Gato();
		c2.emiteSom();
		c2.especie = "cat";
		c2.idade = 20;
		c2.exibeDados();
		System.out.println("-----------------------");
		
		Animal c3 = new Cavalo();
		c3.emiteSom();
		c3.especie = "Horse";
		c3.idade = 25;
		c3.exibeDados();
		System.out.println("-----------------------");
	}

}
