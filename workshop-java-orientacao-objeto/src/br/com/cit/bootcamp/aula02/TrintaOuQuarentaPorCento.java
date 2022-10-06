package br.com.cit.bootcamp.aula02;

public class TrintaOuQuarentaPorCento implements RegraDeCalculo{
	public double calcula(Funcionario funcionario)
	{
		if(funcionario.getSalarioBase() > 1000.0) {
			return funcionario.getSalarioBase() / 0.70;
		}
		
		return funcionario.getSalarioBase() / 0.60;
	}
}