package Exercicio9;

public class Retangulo {
	private int x, y;
	int area;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void inserir_lados(int a, int b) {
		this.x = a;
		this.y = b;
	}
	
	public void retangulo(int a, int b) {
		System.out.println("Lado x: "+this.x+ "\tLado y: " +this.y);
	}
	
	public void calcular_area() {
		this.area = this.x * this.y;
	}
}
