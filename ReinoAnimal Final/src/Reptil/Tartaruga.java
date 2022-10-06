package Reptil;

public class Tartaruga extends Reptil{
	
	private int cabecaDentroCasco;
	
	
	public Tartaruga() {
		
	}
	public Tartaruga(String nome, int sexo, String cor, int peso, String protecaoPele, int cabecaDentroCasco ) {
		super(nome, sexo, cor, peso, protecaoPele);
		this.cabecaDentroCasco = cabecaDentroCasco;
		
	}
	

	public int getCabecaDentroCasco() {
		return cabecaDentroCasco;
	}
	public void setCabecaDentroCasco(int cabecaDentroCasco) {
		this.cabecaDentroCasco = cabecaDentroCasco;
	}
	

	public void dormindo(int cabecaDentroCasco) {
		if (cabecaDentroCasco == 1) {
			System.out.println("Silêncio! Tartaruga está dormindo.");
		}else {
			System.out.println("Tartaruga ativa!!!");
		}

	}
}