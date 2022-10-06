//
// Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua 
//média e mostre na tela. No final, analise a média e mostre se o aluno teve ou 
//não um bom aproveitamento (se ficou acima da média 7.0)

import java.util.Scanner;

public class MediaEntreAlunos {
public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	System.out.println("Imprima o nome do aluno ");
	String nome = leia.nextLine();
	
	System.out.println("Imprima a primeira nota");
	float primeiraNota= leia.nextFloat();
	
	System.out.println("Imprima a segunda nota");
	float segundaNota= leia.nextFloat();
	
	float media=(primeiraNota + segundaNota)/2;
	System.out.println("O nome "+nome + " teve sua média " +media+ " entre as duas notas");
	
	if((media >=7) && (media <=10)) {
		System.out.println("Aluno aprovado por media ");
		}
	else if((media >=6) && (media >=5)) {
		System.out.println("Em recuperação, em analise pelo corpo discente ");
	}
		else {
			System.out.println("Em recuperação");
		}
	leia.close();
	
}
}
