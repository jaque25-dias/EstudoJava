package Aplicacao;

import java.util.Scanner;

import Entidade.Repeticao;

//62) Faça um programa usando a estrutura “faça enquanto” que leia a idade de 
//várias pessoas. A cada laço, você deverá perguntar para o usuário se ele quer ou 
//não continuar a digitar dados. No final, quando o usuário decidir parar, mostre 
//na tela:
//a) Quantas idades foram digitadas
//b) Qual é a média entre as idades digitadas
//c) Quantas pessoas tem 21 anos ou mais.

public class ProgramaEnquanto {
 
	public static void main(String[] args) {
		
		Scanner leia= new Scanner (System.in);
		
		Repeticao repita = new Repeticao();
		
		System.out.println("Entre com numero");
		repita.numero = leia.nextInt();
			
	}
	
}
