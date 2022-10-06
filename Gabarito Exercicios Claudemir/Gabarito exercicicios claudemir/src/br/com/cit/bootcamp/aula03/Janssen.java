package br.com.cit.bootcamp.aula03;

public class Janssen extends Vacina {

	/*
	 * Regra: numero de vacinas deve ser igual a zero e seguir a regra de idade.
	 */
	public boolean regra(CartaoDeVacinacao cartaoVacinacao) {
		return  cartaoVacinacao.getQuantidadeVacina() == 0
				&& this.regraIdade(cartaoVacinacao.getPessoa());
	}

}
