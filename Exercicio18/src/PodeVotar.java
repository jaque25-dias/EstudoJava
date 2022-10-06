import java.util.Scanner;

//Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade 
//dela e depois mostre se ela pode ou não votar.
public class PodeVotar {

	public static void main(String[] args) {		
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o seu ano de nascimento");
		int anoDeNascimento = leia.nextInt();
		int anoAtual = 2022;
		
		int calculo = anoAtual - anoDeNascimento;
		
		if (calculo >= 16) {
			System.out.println("Parabéns você pode votar " +calculo+ " anos ");
			
		} else {
		System.out.println(" Infelizmente você não poderá votar, pois não tem a idade recomendada. ");
		}
		
		leia.close();
	}
	}
