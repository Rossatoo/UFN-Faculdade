package Exercicio8;

public class Principal {

	public static void main(String[] args) {

	Carro c = new Carro();
	c.setPlaca("JAW5E79");
	c.setNumChassi(987654);
	c.setVeloc(80);
	
	c.acelerar(10);
	if(c.frear() == true) {
		c.setVeloc(c.getVeloc() - 5);
	}
	
	System.out.println("Velocidade: "+c.getVeloc());
	
	}

}
