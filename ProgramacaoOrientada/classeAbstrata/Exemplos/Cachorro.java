package Exemplos;

public class Cachorro extends Animal{
	protected String raca;
	
	@Override
	public void emiteSom() {
		System.out.println("Au! Au!");
	}
	public void exibeDados() {
		System.out.println("Especie: "+especie);
		System.out.println("Idade: "+idade);
		System.out.println("Raca: "+raca);
	}
	
	public void cuidarPatio() {
		System.out.println("Cuidado!! Cao Perigoso!");
	}

}
