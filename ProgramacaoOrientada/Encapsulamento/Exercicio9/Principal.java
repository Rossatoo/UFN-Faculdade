package Exercicio9;

public class Principal {

	public static void main(String[] args) {
		Retangulo r = new Retangulo();
		
		r.setX(5);
		r.setY(10);
		r.retangulo(r.getX(), r.getY());
		r.calcular_area();
		
		
		System.out.println("Area do retangulo: " +r.area);
		
	}

}
