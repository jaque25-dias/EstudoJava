
public class ControleRemoto implements Controlador {

	// atributos da classe
	private int volume;
	private int ligado;
	private int tocando;
	
	
	
	// metodos especiais
	
    public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getLigado() {
		return ligado;
	}

	public void setLigado(int ligado) {
		this.ligado = ligado;
	}

	public int getTocando() {
		return tocando;
	}

	public void setTocando(int tocando) {
		this.tocando = tocando;
	}

	public ControleRemoto() {
    	this.volume = 0;
    	this.ligado = 1;
    	this.tocando= 1;
    	   	
    }
    
	@Override
	public void ligar() {
		
	}


	@Override
	public void desligar() {
		
	}


	@Override
	public void abrirMenu() {
		System.out.println("Está ligado ? "+this.getLigado());
		System.out.println("Está tocando ? "+this.getTocando());
		System.out.println("Volume: "+this.getVolume());
		for (int i = 0; i<=this.getVolume(); i+=10) {
			System.out.println("|");
		}
	}

	@Override
	public void fecharMenu() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void maisVolume() {
     if (this.getLigado()) {
    	 this.setVolume(this.getVolume()+1);
     }
	}


	@Override
	public void menosVolume() {
		 if (this.getLigado()) {
	    	 this.setVolume(this.getVolume()-1);
	     }
	}

	@Override
	public void ligarMudo() {
		if (this.getLigado()==1 && this.getVolume()>0){
			this.setVolume(volume);
		}
	}
	@Override
	public void desligarMudo() {
	if (this.getLigado() && this.getVolume() ==1) {
		this.setVolume(30);
	}
	}

	@Override
	public void play() {
		if (this.getLigado()==1 && (this.getTocando()==2)) {
			this.setTocando(1);
		}	else {
			System.out.println("Não é possivel reproduzir");
		}
	}

	@Override
	public void pause() {
			if(this.getLigado()==1 && this.getTocando()==1) {
				this.setTocando(2);
		}	else {
			System.out.println("Não é possível Pausar");
		}
		
	}
	
}