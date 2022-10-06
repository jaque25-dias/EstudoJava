package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidade.ContaU;

public class ProgramaU {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		ContaU contau;
		
		System.out.println("Seja bem-vindo ao seu Banco!!");
		System.out.println("Digite nome do Titular : ");
		String titular = leia.next();
		
		System.out.print("Digite o numero da Conta: ");
		int numeroConta = leia.nextInt();
		
		System.out.print("Deseja realizar um depósito inicial na conta? 1|sim  2|não). ");
		int responde = leia.nextInt();
		
		if (responde == 1) {
			System.out.print("Entre com o valor inicial: ");
			double inicialDeposito = leia.nextDouble();
			System.out.println();
			contau = new ContaU(titular,numeroConta, inicialDeposito);
		}
		else {
			contau= new ContaU(titular,numeroConta);
		}
		
		System.out.println();
		System.out.println("Dados da Conta:");
		System.out.println(contau);
		
		System.out.println();
		System.out.print("Digite um valor para depósito: ");
		double valorDepositado = leia.nextDouble();
		contau.depositar(valorDepositado);
		System.out.println(contau);
		
		System.out.println();
		System.out.print("Digite o valor para saque: ");
		double valorSaque= leia.nextDouble();
		contau.saque(valorSaque);
		System.out.println(contau);
		
		leia.close();	
	}
}
