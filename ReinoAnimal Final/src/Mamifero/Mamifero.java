package Mamifero;

import java.util.ArrayList;

import Entidades.Animal;


public class Mamifero extends Animal {

	private String habitat;
	private ArrayList<Mamifero> mamiferoAdicionado = new ArrayList<Mamifero>();
	
	public Mamifero() {
		
	}
	Mamifero(String nome, int sexo, String cor, int peso, String habitat) {
		super(nome, sexo, cor, peso);
		this.habitat= habitat;
	}


	public String getHabitat() {
		return habitat;
	}


	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}


	public void setMamiferoAdicionado(ArrayList<Mamifero> mamiferoAdicionado) {
		this.mamiferoAdicionado = mamiferoAdicionado;
	}


	public void adicionarHumano(Mamifero novoHumano) {
		this.mamiferoAdicionado.add(novoHumano);
	}
	
	public void adicionarGato (Mamifero novoGato) {
		this.mamiferoAdicionado.add(novoGato);
	}

	public ArrayList<Mamifero> getMamiferoAdicionado() {
		return mamiferoAdicionado;
	}

	public void setAnimaisAdicionados(ArrayList<Mamifero> mamiferoAdicionado) {
		this.mamiferoAdicionado = mamiferoAdicionado;
	
	}
	
}
