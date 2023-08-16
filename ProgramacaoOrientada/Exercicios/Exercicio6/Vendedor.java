package Exercicio6;

public class Vendedor extends Funcionario{
	double comissaoVenda;
	
	@Override
	public double calcularSalario() {
		salario += comissaoVenda;
		return salario;
	}
	
}
