import java.util.Scanner;
//Crie um programa que leia o nome e o salário de um funcionário, mostrando no
//final uma mensagem.
//Ex:
//Nome do Funcionário: Maria do Carmo
//Salário: 1850,45
//O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
	
		System.out.println("Digite o nome do funcionário ");
		String nome=leia.nextLine();
		System.out.println("Digite o salário do funcionário ");
		Float salario =leia.nextFloat();
		leia.nextLine();System.out.println("Digite o mês ");
		String mes =leia.nextLine();
		System.out.println("O funcionário, " + nome + " no mês de " + mes+ " teve um salário de R$ " +salario);
		
		leia.close();
	}
	}
