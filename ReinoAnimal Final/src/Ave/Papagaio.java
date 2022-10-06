package Ave;

public class Papagaio {

	private int falando;

	public Papagaio() {

	}

	public Papagaio(String nome, int sexo, String cor, int peso, int voa, String penas) {
		super();
	}

	public Papagaio(int falando) {
		super();
		this.falando = falando;
	}

	public int getFalando() {
		return falando;
	}

	public void setFalando(int falando) {
		this.falando = falando;
	}

	public void addAve(Papagaio papagaio) {
		// TODO Auto-generated method stub

	}

	public void cantar(int cantar) {
		if (cantar == 1) {
			System.out.println("Esse Papagaio é um verdadeiro artista está cantando AmyWine");
		} else {
			System.out.println("Esse Papagaio precisa ser treinado, ele ainda não tem a habilidade de cantar");
		}
	}

}

