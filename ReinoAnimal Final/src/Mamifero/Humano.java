package Mamifero;

import java.util.ArrayList;

public class Humano extends Mamifero{
	
	private String linguaNativa;
	private int idade;
	
	@SuppressWarnings("unused")
	private ArrayList<Mamifero> humanoAdicionado= new ArrayList<>();
	
	public Humano() {
	}
	
	

	Humano(String nome, int sexo, String cor, int peso, String habitat, String linguaNativa, int idade) {
		super(nome, sexo, cor, peso, habitat);
		this.linguaNativa = linguaNativa;
		this.idade = idade;
	
	}

	
	public String getLinguaNativa() {
		return linguaNativa;
	}

	public void setLinguaNativa(String linguaNativa) {
		this.linguaNativa = linguaNativa;
	}
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void getHumanoAdicionado() {
		
	}

	public void setHumanoAdicionado(ArrayList<Mamifero> humanoAdicionado) {
		this.humanoAdicionado= humanoAdicionado;
	}
	
	public void amamentar(int sexo) {
		if(sexo == 1) {
			System.out.println("Esse humano pode amamentar, pois é do sexo feminino.");
		} else {
			System.out.println("Esse humano é do sexo masculino, portanto não pode alimentar.");
		}
	}
	
}
	