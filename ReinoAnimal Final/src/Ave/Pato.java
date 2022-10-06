package Ave;

public class Pato extends Ave {

	private int nadando;

	public Pato() {

	}

	public Pato(String nome, int sexo, String cor, int peso, int nadando) {
		super(nome, sexo, cor, peso);
		this.nadando = nadando;
	}

	public Pato(String nome, int sexo, String cor, int peso, int voa, String penas) {
		super(nome, sexo, cor, peso, voa, penas);
		// TODO Auto-generated constructor stub
	}

	public int getNadando() {
		return nadando;
	}

	public void setNadando(int nadando) {
		this.nadando = nadando;
	}

	public void addAve(Pato novoPato) {
		// TODO Auto-generated method stub

	}
	public void nadar(int local) {
		if (local == 1) {
			System.out.println("O Pato está nadando...");
		} else {
			System.out.println("O Pato está caminhando...");
		}

}
}
