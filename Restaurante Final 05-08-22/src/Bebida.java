
public class Bebida extends Item {
	
	private int volume;
	public static boolean bebidaAlcoolica;
    
	public Bebida(String nomeItem, double preco, int volume, boolean bebidaAlcoolica) {
		super(nomeItem, preco);
		this.volume = volume;
		this.bebidaAlcoolica = bebidaAlcoolica;
	}
	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isBebidaAlcoolica() {
		return bebidaAlcoolica;
	}

	public void setBebidaAlcoolica(boolean bebidaAlcoolica) {
		this.bebidaAlcoolica = bebidaAlcoolica;
	}


		
}