public class Master implements CartaoDeCredito {

	public boolean validaCartao(String numero) {
		if(numero.length() ==15 && numero.startsWith("5"))
			return true;
		
		return false;
	}

}
