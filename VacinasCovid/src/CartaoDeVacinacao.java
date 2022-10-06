

public class CartaoDeVacinacao {
		
		private Pessoa pessoa;
		
		public Pessoa getPessoa() {
			return pessoa;
		}
		public void setPessoa(Pessoa pessoa) {
			this.pessoa = pessoa;
		}
		public int getQuantidadeVacina() {
			return quantidadeVacina;
		}
		public void setQuantidadeVacina(int quantidadeVacina) {
			this.quantidadeVacina = quantidadeVacina;
		}
		public int getDiasDaUltimaVacina() {
			return diasDaUltimaVacina;
		}
		public void setDiasDaUltimaVacina(int diasDaUltimaVacina) {
			this.diasDaUltimaVacina = diasDaUltimaVacina;
		}
		private int quantidadeVacina;
		private int diasDaUltimaVacina;
		
	}	