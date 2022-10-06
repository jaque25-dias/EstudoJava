import java.util.Scanner;

public class OlaNome {
//	Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-
//	vindas para ela:
//
//	Ex:
//	Qual é o seu nome? João da Silva
//	Olá João da Silva, é um prazer te conhecer!
	
	public static void main(String[] args) { 
	       
		
    	Scanner leia = new Scanner(System.in);
        
    	System.out.println("Qual seu nome ? ");
        
    	String nome = leia.nextLine();
    	
    	System.out.print("Olá " + nome);
    	System.out.print(" é prazer te conhecer! ");
        
    	leia.close();

    }
}
