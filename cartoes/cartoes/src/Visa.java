public class Visa implements CartaoDeCredito {

	public boolean validaCartao(String numero) {
		
		if(numero.length() == 15 && numero.startsWith("1"))
			return true;
		
		return false;
	}

}