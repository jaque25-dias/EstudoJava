//29) Desenvolva um programa que leia o nome de um funcionário, seu salário, 
//	quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de 
//	acordo com a tabela a seguir:
//	 - Até 3 anos de empresa: aumento de 3%
//	 - entre 3 e 10 anos: aumento de 12.5%
//	 - 10 anos ou mais: aumento de 20%
//	

import java.util.Scanner;

public class SalarioReajustado {
public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite o seu nome: ");
	String nome = leia.next();
	
	System.out.println("Digite o seu salário: ");
	Double salario = leia.nextDouble();
	
	int anos1 = salario*1.03;
	int anos2 = anos*1.1125;	
	int anos3 = anos*1.20;
	

	
	
	
	
}
	
}
