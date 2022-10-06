package br.com.cit.bootcamp.aula03;

public class CoronaVac extends Vacina {
	
	/*
	 * Regra: Numero de dias para vacinar deve ser maior que 122
	 *  e numero de vacinas deve ser menor que 4 
	 *  e seguir a regra de idade.
	
	 * *** Deve sobreescrever a regra de idade para maior que 3 anos 
	 *  e menor que 80 anos
	 */
	
	@Override
	public boolean regraIdade(Pessoa pessoa)
	{
		return pessoa.getIdade() > 3 && pessoa.getIdade() <= 80;
	}
	
	public boolean regra(CartaoDeVacinacao cartaoVacinacao) {
		
		return cartaoVacinacao.getDiasDaUltimaVacina() > 122 
				&& cartaoVacinacao.getQuantidadeVacina() < 4
				&& this.regraIdade(cartaoVacinacao.getPessoa());

	}

	
}
