package Prova;

public class CarroEletrico extends Carro{
	private int autonomiaBateria, cargaBateria;

	public int getAutonomiaBateria() {
		return autonomiaBateria;
	}

	public void setAutonomiaBateria(int autonomiaBateria) {
		this.autonomiaBateria = autonomiaBateria;
	}

	public int getCargaBateria() {
		return cargaBateria;
	}

	public void setCargaBateria(int cargaBateria) {
		this.cargaBateria = cargaBateria;
	}
	
	public void ligar() {
		if(this.cargaBateria > 0) {
			System.out.println("Bombando!");
		}
		else {
			System.out.println("Desligado!");
		}
	}
	
	
}
