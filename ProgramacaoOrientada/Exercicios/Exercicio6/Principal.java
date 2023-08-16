package Exercicio6;

public class Principal {

	public static void main(String[] args) {
		Vendedor vendedor = new Vendedor();
		vendedor.nome = "Matheus";
		vendedor.salario = 1212.00;
		vendedor.comissaoVenda = 500;
		System.out.println("Nome vendedor: "+vendedor.nome+ "\tSalario Base: "+vendedor.salario);
		System.out.println("Salario Final: "+vendedor.calcularSalario());
		System.out.println("----------------------------");
		
		Gerente gerente = new Gerente();
		gerente.nome = "Ricardo";
		gerente.salario = 8000.00;
		gerente.comissaoCargo = 2000;
		System.out.println("Nome Gerente: "+gerente.nome+ "\tSalario Base: "+gerente.salario);
		System.out.println("Salario Final: "+gerente.calcularSalario());

	}

}
