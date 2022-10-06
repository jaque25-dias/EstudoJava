package Aplicacao;

import java.util.Scanner;

import Entidade.ContaC;

public class TesteBank {
 
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		
		ContaC novaConta= new ContaC();

		
		int servicos;
		String titular;
		
		System.out.println("Digite o nome do titular da conta: ");
		titular=leia.nextLine();
		
		
		do {
			System.out.println("~~~~~~~~~Seja Bem vindo ao JsBank~~~~~~~~");
			System.out.println("Digite um número de serviço para iniciar o atendimento ");
			System.out.println("1- Dados bancarios ");
			System.out.println("2- Saque ");
			System.out.println("3- Depósito ");
			System.out.println("4- Transferência/PIX ");
			System.out.println("0- SAIR");
			
			System.out.print("Serviços: ");
			servicos = leia.nextInt();
			
	} while(servicos != 0);
		
	switch (servicos) {
	case 1:
    novaConta.sacar(servicos);
		break;
    case 2:
		
		break;
     case 3:
		
		break;
		
     case 4:
 		
 		break;
 		
     case 0:
 		System.out.println(" SAIR ");
 		break;
	default:
		break;
	}
		leia.close();	
	}	
}