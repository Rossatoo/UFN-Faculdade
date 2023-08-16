package Prova;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Carro c = new Carro();
		CarroEsportivo cEs = new CarroEsportivo();
		CarroEletrico cEl = new CarroEletrico();
		
		cEs.setCor("Branco");
		cEs.setAnoFab(2022);
		cEs.setModelo("Porshe");
		cEs.setVelocAtual(120);
		cEs.acelerar(10);
		cEs.frear(5);
		cEs.setPotenciaMotor(550);
		cEs.aumentarPotenciaMotor(15);
		
		cEl.setCor("Preto");
		cEl.setAnoFab(2020);
		cEl.setModelo("Uno");
		cEl.setVelocAtual(150);
		cEl.acelerar(10);
		cEl.frear(5);
		cEl.setAutonomiaBateria(10);
		cEl.setCargaBateria(150);
		
		System.out.println("Carro Esportivo");
		System.out.println("Cor: "+cEs.getCor());
		System.out.println("Ano: "+cEs.getAnoFab());
		System.out.println("Modelo: "+cEs.getModelo());
		System.out.println("Veloc: "+cEs.getVelocAtual());
		System.out.println("Potencia: "+cEs.getPotenciaMotor());
		
		System.out.println("\n\nCarro Eletrico");
		System.out.println("Cor: "+cEl.getCor());
		System.out.println("Ano: "+cEl.getAnoFab());
		System.out.println("Modelo: "+cEl.getModelo());
		System.out.println("Veloc: "+cEl.getVelocAtual());
		System.out.println("Autonomia Bateria: "+cEl.getAutonomiaBateria());
		System.out.println("Carga Bateria: "+cEl.getCargaBateria());
		cEl.ligar();
	}

}
