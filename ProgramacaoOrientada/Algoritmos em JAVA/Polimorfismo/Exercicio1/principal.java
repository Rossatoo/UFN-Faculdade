package Exercicio1;

public class principal {

	public static void main(String[] args) {
		FormaGeometrica fg = new FormaGeometrica();
		
		fg = new triangulo();
		System.out.println("Area do triangulo: "+ fg.calcularArea(2, 5));
	}

}
