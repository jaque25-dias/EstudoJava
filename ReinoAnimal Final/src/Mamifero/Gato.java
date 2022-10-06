package Mamifero;

public class Gato extends Mamifero{

	private String miado;
	
	public Gato () {
		
	}
	

	Gato(String nome, int sexo, String cor, int peso, String habitat, String miado) {
		super(nome, sexo, cor, peso, habitat);
		this.miado=miado;
	}


	public String getMiado() {
		return miado;
	}

	public void setMiado(String miado) {
		this.miado = miado;
	}

	public void mamar(int idadeDoGato) {
		if (idadeDoGato <=1) {
			System.out.println("Esse gato ainda mama, programe o desmame de acordo "
					+ "com orientações do conselho de medicina veterinária");	
		}else {
			System.out.println("Esse gato não mama.");
		}
	}
	}

