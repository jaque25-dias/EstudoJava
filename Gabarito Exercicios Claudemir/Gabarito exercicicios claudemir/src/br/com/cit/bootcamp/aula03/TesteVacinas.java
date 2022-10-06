package br.com.cit.bootcamp.aula03;

import java.util.Scanner;

public class TesteVacinas {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o nome:");
		String nome = leia.nextLine();
		
		System.out.println("Informe a idade:");
		int idade = leia.nextInt();
		
		System.out.println("Informe a quantidade de vacinas aplicadas:");
		int vacinasAplicadas = leia.nextInt();
		
		System.out.println("Informe a quantidade de dias deste a ultima vacinas aplicada:");
		int quantidadeDiasVacina = leia.nextInt();
		
		leia.close();
		
		Pessoa pessoa = new Pessoa(nome,idade);
		
		CartaoDeVacinacao cartao = new CartaoDeVacinacao();
		cartao.setDiasDaUltimaVacina(quantidadeDiasVacina);
		cartao.setQuantidadeVacina(vacinasAplicadas);
		cartao.setPessoa(pessoa);
		
		/*
		 * Como melhorar esse programa?
		 * 1 - Criar um Enum de TipoDeVacina
		 * 1.1 - Colocar as opções de Enum sendo Coronavac, Astrazenica, Janssen, Pfizer
		 * 2. Criar atributo com get e set do TipoDeVacina na classe CartaoDeVacinacao
		 * 3. Alterar o enum TipoDeVacina incluindo a regra em cada uma das opções (Referencia: Projeto de Salario no Enum Cargo).
		 * 4. Alteracao a classe TesteVacinas realizando um for do TipoDeVacina.values() para demonstrar as opções de vacinas existentes.
		 * 5. Vamos alterar a class abstract Vacina  o metodo regra agora deve ser void, e em cada implementação das classes filhas deve-se imprimir utilizando o sysout se a pessoa é apta ou não.
		 * 5.1 - O(a) {nome} que optou pela vacina {vacina} pode tomar vacina? .
		 * 5.2 - Sim ou Não.
		 * 6.0 - Alterar a chamada da regra para cartao.getTipoVacina().regra()(Referência class TesteSalario)
		 */
		
		System.out.println("Estou apto para aplicar a vacina CoronaVac ?");
		System.out.println(new CoronaVac().regra(cartao)== true ? "Sim":"Não");
		
		System.out.println("Estou apto para aplicar a vacina Astrazenica ?");
		System.out.println(new Astrazenica().regra(cartao)== true ? "Sim":"Não");
		
		System.out.println("Estou apto para aplicar a vacina Pfzier ?");
		System.out.println(new Pfizer().regra(cartao) == true ? "Sim":"Não");
		
		System.out.println("Estou apto para aplicar a vacina Janssen ?");
		System.out.println(new Janssen().regra(cartao)== true ? "Sim":"Não");
		
	}

}
