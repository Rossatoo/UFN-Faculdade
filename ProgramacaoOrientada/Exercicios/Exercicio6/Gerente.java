package Exercicio6;

public class Gerente extends Funcionario{
	double comissaoCargo;
	
	@Override
	public double calcularSalario() {
		salario += comissaoCargo;
		return salario;
	}
	
}
