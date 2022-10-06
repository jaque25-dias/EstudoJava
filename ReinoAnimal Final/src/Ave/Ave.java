package Ave;


import java.util.ArrayList;

import Entidades.Animal;

public class Ave extends Animal {

	private int voa;
	private String penas;
	private ArrayList<Ave> aveAdicionada = new ArrayList<>();

	public Ave() {
	}

	public Ave(String nome, int sexo, String cor, int peso) {
		super(nome, sexo, cor, peso);
	}
	// TODO Auto-generated constructor stub

	public Ave(String nome, int sexo, String cor, int peso, int voa, String penas) {
		super(nome, sexo, cor, peso);
		this.voa = voa;
		this.penas = penas;
	}

	public int getVoa() {
		return voa;
	}

	public void setVoa(int voa) {
		this.voa = voa;
	}

	public String getPenas() {
		return penas;
	}

	public void setPenas(String penas) {
		this.penas = penas;
	}

	public ArrayList<Ave> getAveAdicionada() {
		return aveAdicionada;
	}

	public void setAveAdicionada(ArrayList<Ave> aveAdicionada) {
		this.aveAdicionada = aveAdicionada;
	}

	
}

	

