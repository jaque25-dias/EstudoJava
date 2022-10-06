package Mamifero;

import java.util.Scanner;


public class TestaMamifero {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int adicionarNovoMamifero= 0;
		int idadeDoGato =0;
		int sexo= 0;
		do {
		System.out.println("Qual mamifero deseja adicionar?");
		System.out.println("[1] Humano [2] Gato [3] Sair");
		adicionarNovoMamifero = scanner.nextInt();
		
		switch (adicionarNovoMamifero) {
		case 1: 
			System.out.println("Qual o nome: ");
			String nome = scanner.nextLine();
			scanner.nextLine();
			System.out.println("Qual local reside?");
			String habitat= scanner.nextLine();
			scanner.nextLine();
			System.out.println("Qual idioma nativo? ");
			String linguaNativa = scanner.nextLine();
			scanner.nextLine();
			System.out.println("Qual idade: ");
			int idade = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Qual o sexo: [1] Fem [2] Masc ");
			sexo = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Qual a cor: ");
			String cor = scanner.nextLine();
			scanner.nextLine();
			System.out.println("Qual o peso: ");
			int peso = scanner.nextInt();
			
			Humano humano = new Humano(nome, sexo, cor, peso, habitat, linguaNativa, idade);
			humano.adicionarHumano(humano);
			humano.amamentar(sexo);
			
			break;
		
		case 2: 
			
			System.out.println("Qual o nome: ");
			String nomeGato = scanner.nextLine();
			scanner.nextLine();
			System.out.println("Qual o sexo: [1] Fêmea [2] Macho ");
			int sexoGato = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Qual a cor: ");
			String corGato = scanner.nextLine();
			scanner.nextLine();
			System.out.println("Qual o peso: ");
			int pesoGato = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Qual local o gato vive? ");
			String habitatGato = scanner.nextLine();
			scanner.nextLine();
			System.out.println("Qual som o gato emite?");
			String miadoGato = scanner.nextLine();
			scanner.nextLine();
			
			 Gato gato = new Gato(nomeGato, sexoGato, corGato, pesoGato,habitatGato, miadoGato);
			 gato.adicionarGato(gato);
			 System.out.println("Qual a idade do Gato?");
			 idadeDoGato=scanner.nextInt();
			 gato.mamar(idadeDoGato);
			 
			break;
		
			
	case 3:
		
		System.out.println("Saindo do programa...");
		
		break;
	
		
		
		default:
			System.out.println("Opção inválida!");
		}
		
		} while (adicionarNovoMamifero <=3);
		
		
scanner.close();
	}
	
}
