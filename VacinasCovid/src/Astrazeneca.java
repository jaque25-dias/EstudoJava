
public class Astrazeneca extends Vacina {

	/*
	 * Regra: Numero de dias para vacinar deve ser maior que 122 dias
	 *  e numero de vacinas deve ser menor que 4
	 *  e deve seguir a regra de idade.
	 */
	public boolean regra(CartaoDeVacinacao cartaoVacinacao) {
		
		return cartaoVacinacao.getDiasDaUltimaVacina() > 122 
				&& cartaoVacinacao.getQuantidadeVacina() < 4
				&& this.regraIdade(cartaoVacinacao.getPessoa());
	}
}