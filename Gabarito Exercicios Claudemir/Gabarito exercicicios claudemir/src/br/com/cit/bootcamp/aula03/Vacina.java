package br.com.cit.bootcamp.aula03;

public abstract class Vacina {

	/*
	 * Implementar regra geral de vacinação que é:
	 * idade acima de 05 anos até 80.
	 */
	public boolean regraIdade(Pessoa pessoa)
	{		
		return pessoa.getIdade() > 5 && pessoa.getIdade() <= 80;
	}
	
	abstract boolean regra(CartaoDeVacinacao cartaoVacinacao);
}
