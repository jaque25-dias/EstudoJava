package Reptil;

public class Cobra extends Reptil {

	private int comprimento;
	private int venenosa;

	public Cobra () {
		
	}
	public Cobra(String nome, int sexo, String cor, int peso, String protecaoPele, int comprimento, int venenosa) {
		super(nome, sexo, cor, peso,protecaoPele);
		this.comprimento = comprimento;
		this.venenosa = venenosa;
	}

	
	
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public int getVenenosa() {
		return venenosa;
	}
	public void setVenenosa(int venenosa) {
		this.venenosa = venenosa;
	}
	public void rastejar(int localCobra) {
		if (localCobra == 1) {
			System.out.println("A Cobra encontra-se ativa e rastejando.");
		}else { 
			System.out.println(" A Cobra está na água se refrescando.");
		}
		
	}
}
