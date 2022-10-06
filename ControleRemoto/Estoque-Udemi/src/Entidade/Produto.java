package Entidade;

public class Produto {
	private String nome;
	private Double preco;
	private int quantidade;
	
	public Produto (String nome, Double preco, int quantidade) {
		this.nome= nome;
		this.preco = preco;
		this.quantidade=quantidade;
	}
	
	
	public double totalValorEstoque() {
	 return preco * quantidade;	
	}
	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}
		
	public void removerEstoque(int quantidade) {
    	this.quantidade -= quantidade;
	}
	public String toString() {
		return nome
		+ " , $ "
		+ String.format("%.2f", preco)
		+ " , "
		+ quantidade
		+ " unidade, Total: R$ "
		+ String.format("%.2f",totalValorEstoque());	
    }
	}
