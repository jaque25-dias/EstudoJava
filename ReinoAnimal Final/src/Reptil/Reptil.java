package Reptil;

import java.util.ArrayList;
import Entidades.Animal;

public class Reptil extends Animal {
	
	private String protecaoPele;
	private ArrayList<Reptil> reptilAdicionado = new ArrayList<>();
	
	
	public Reptil () {
		
	}
	public Reptil(String nome, int sexo, String cor, int peso) {
		super(nome, sexo, cor, peso);
		// TODO Auto-generated constructor stub
	}
	Reptil(String nome, int sexo, String cor, int peso, String protecaoPele) {
		super(nome, sexo, cor, peso);
		this.protecaoPele= protecaoPele;
		
	}
	
	public String getHabitat() {
		return protecaoPele;
	}
	public void setHabitat(String protecaoPele) {
		this.protecaoPele = protecaoPele;
	}
	public ArrayList<Reptil> getReptilAdicionado() {
		return reptilAdicionado;
	}
	public void setReptilAdicionado(ArrayList<Reptil> reptilAdicionado) {
		this.reptilAdicionado = reptilAdicionado;
	}

	}

