package Exercicio6;

public class Casa {
	public int calcularPreco(int tamanho) {
		return tamanho * 10;
	}
	
	public int calcularPreco(int tamanho, int quartos) {
		return tamanho * 10 * quartos;
	}
}
