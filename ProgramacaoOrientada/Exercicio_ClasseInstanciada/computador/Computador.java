package computador;

public class Computador {
	public String marca;
	public String modelo;
	public String tipo;
	public float preco;
	
	public static void main(String[] args) {
		
		Computador comp = new Computador();
		comp.marca = "Samsung";
		comp.modelo = "Odyssey";
		comp.tipo = "Gamer";
		comp.preco = 4500;
		System.out.println("Marca: " + comp.marca + " - Modelo: " + comp.modelo + " - Tipo: " + comp.tipo + " - Preco: " + comp.preco);
	}

}
