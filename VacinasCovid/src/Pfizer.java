public class Pfizer extends Vacina {
//
//		 * Regra: Numero de dias para vacinar deve ser maior que 122 dias
//		 *  e numero de vacinas ser menor que 2 e seguir a regra de idade.
//		 *
		public boolean regra(CartaoDeVacinacao cartaoVacinacao) {
	
			return  cartaoVacinacao.getDiasDaUltimaVacina() > 122 
					&& cartaoVacinacao.getQuantidadeVacina() < 2
					&& this.regraIdade(cartaoVacinacao.getPessoa());
		}

	}