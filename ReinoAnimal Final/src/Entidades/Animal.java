package Entidades;

public abstract class Animal {

	private String nome;
	private int sexo;
	private String cor;
	private int peso;
	
	
	public Animal() {

	}
	
	public Animal(String nome, int sexo, String cor, int peso) {
		this.nome = nome;
		this.sexo = sexo;
		this.cor = cor;
		this.peso = peso;
		
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

}
