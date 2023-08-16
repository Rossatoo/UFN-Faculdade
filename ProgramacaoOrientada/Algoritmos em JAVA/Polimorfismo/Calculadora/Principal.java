package Calculadora;

public class Principal {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		System.out.println(calc.somar(5, 10));
		System.out.println(calc.somar(5, 10, 20));
		System.out.println(calc.somar(3.5, 7));
		
		int produto = calc.multiplicar(5, 2);
		System.out.println("Resultado int: " + produto);
		
		double produtoD = calc.multiplicar(5, 5.5);
		System.out.println("Resultado double: " + produtoD);
		
		

	}

}
