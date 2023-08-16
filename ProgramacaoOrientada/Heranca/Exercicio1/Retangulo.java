package Exercicio1;

public class Retangulo extends Figura {
	protected int altura, largura, area;
	
	public Retangulo(String cor, boolean preenchido, int altura, int largura) {
		super(cor, preenchido);
		this.altura = altura;
		this.largura = largura;
	}
	
	public void calcularArea() {
		System.out.println(this.area = this.altura * this.largura);
	}
}
