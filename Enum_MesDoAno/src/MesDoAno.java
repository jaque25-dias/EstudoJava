
public enum MesDoAno {
	JANEIRO(1, "MÊS UM"), FEVEREIRO(2, "MÊS DOIS"), MARCO(3, "MÊS TRÊS"), ABRIL(4, "MÊS QUATRO"), MAIO(5, "MÊS CINCO"),
	JUNHO(6, "MÊS SEIS"), JULHO(7, "MÊS SETE"), AGOSTO(8, "MÊS OITO"), SETEMBRO(9, "MÊS NOVE"), OUTUBRO(10, "MÊS DEZ"),
	NOVEMBRO(11, "MÊS ONZE"), DEZEMBRO(12, "MÊS DOZE");

	private String mes;
	private int valor;

	private MesDoAno(int valor, String mes) {
		this.mes = mes;
		this.valor = valor;
	}

	public String getMes() {
		return mes;
	}

	public void setDia(String mes) {
		this.mes = mes;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public static void main(String[] args) {

		MesDoAno mesAtual = MesDoAno.JANEIRO;

		switch (mesAtual) {
		case JANEIRO:
			System.out.println(mesAtual.JANEIRO+" "+mesAtual.mes);
			break;
		case FEVEREIRO:
			System.out.println(mesAtual.mes);
			break;
		default:
			System.out.println("Outro mês do ano");
		}
	}

}
