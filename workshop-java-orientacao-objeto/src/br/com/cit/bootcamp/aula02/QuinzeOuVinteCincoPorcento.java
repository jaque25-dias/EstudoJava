package br.com.cit.bootcamp.aula02;

public class QuinzeOuVinteCincoPorcento implements RegraDeCalculo {
	public double calcula (Funcionario funcionario)
	{
		if(funcionario.getSalarioBase() > 2000.0) {
			return funcionario.getSalarioBase() / 0.75;
		}
		
		return funcionario.getSalarioBase() / 0.85;
	}
}