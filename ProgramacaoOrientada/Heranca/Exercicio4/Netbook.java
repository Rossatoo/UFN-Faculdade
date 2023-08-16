package Exercicio4;

public class Netbook extends Computador {
	Computador c = new Computador("","Portatil");
	
	public Netbook(String marca, String modelo ) {
		super(marca, modelo);
	}

	
	public String exibeMarca(String marca) {
		return marca;
	}
}
