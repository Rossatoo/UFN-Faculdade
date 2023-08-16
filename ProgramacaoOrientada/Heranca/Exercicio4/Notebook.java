package Exercicio4;


public class Notebook extends Computador {
	Computador c = new Computador("","");
	
	public Notebook(String marca, String modelo ) {
		super(marca, modelo);
	}
	
	public String exibeMarca(String marca) {
		return marca;
	}
}
