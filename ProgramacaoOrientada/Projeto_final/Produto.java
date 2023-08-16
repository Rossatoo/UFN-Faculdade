package Projeto_final;

public class Produto {
	protected String codigo, descricao;
	protected double precoCusto, precoVenda;
	protected int estoque;

	
	public Produto(String codigo, String descricao, double precoCusto, double precoVenda, int estoque) {
		  this.codigo = codigo; 
		  this.descricao = descricao;
		  this.precoCusto = precoCusto;
		  this.precoVenda = precoVenda;
		  this.estoque =  estoque;
		  }
	 

	public String getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public int getEstoque() {
		return estoque;
	}

	public void venda(int quantidade) {
		if (quantidade <= estoque) {
			estoque -= quantidade;
			
		} else {
			System.out.println("Estoque insuficiente");
		}

	}
}
