package br.com.cit.bootcamp.aula02;

public class CalculadoraDeSalario {
	
	public double calcula(Funcionario funcionario)
	{
		if(Cargo.DESENVOLVEDOR.equals(funcionario.getCargo()))
		{
			return DezOuVintePorcento(funcionario); 
		}
		if(Cargo.DBA.equals(funcionario.getCargo()) ||
				Cargo.TESTER.equals(funcionario.getCargo()))
		{
			return QuinzeOuVinteCincoPorcento(funcionario);
		}
		
		if (Cargo.ESTAGIARIO.equals(funcionario.getCargo())) {
			return TrintaouQuarentaPorcento(funcionario);
		}
		throw new RuntimeException("funcionario inválido");
	}
}