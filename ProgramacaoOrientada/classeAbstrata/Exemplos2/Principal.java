package Exemplos2;

public class Principal {

	public static void main(String[] args) {
		Retangulo r = new Retangulo(3,4);
		System.out.println("Area do retangulo: "+r.area());
		System.out.println("Perimetro do retangulo: "+r.perimetro());
		
		Circulo c = new Circulo(5);
		System.out.println("Area do Circulo: "+c.area());
		System.out.println("Perimetro do circulo: "+c.perimetro());

	}

}
