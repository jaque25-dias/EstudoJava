package Reptil;

import java.util.Scanner;

public class TestaReptil {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int adicionarNovoReptil= 0;
		@SuppressWarnings("unused")
		int localCobra = 0;
		int cabecaDentroCasco =0;
		do {
			System.out.println("Qual Reptil deseja adicionar?");
			System.out.println("[1] Cobra [2] Tartaruga [3] Sair");
			adicionarNovoReptil = scanner.nextInt();

			switch (adicionarNovoReptil) {
			case 1:
				
				System.out.println("Qual o nome: ");
				String nome = scanner.nextLine();
				scanner.nextLine();
				System.out.println("Qual o sexo: [1] Fêmea [2] Macho");
				int sexo = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Qual a cor: ");
				String cor = scanner.nextLine();
				scanner.nextLine();
				System.out.println("Qual o peso: ");
				int peso = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Qual tipo de proteção da pele dessa cobra?");
				String protecaoPele= scanner.nextLine();
				scanner.nextLine();
				System.out.println("Qual o comprimento? ");
				int comprimento = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Essa cobra é venenosa? [1] Sim  [2] Não");
				int venenoso = scanner.nextInt();
						if (venenoso ==1) {
							System.out.println("Cuidado!Essa cobra é venenosa. ");
						} else {
							System.out.println("Essa cobra não é venenosa! ");
						}
				scanner.nextLine();
			
				
				
				Cobra cobra = new Cobra(nome, sexo, cor, peso,protecaoPele, comprimento, venenoso);
				cobra.getReptilAdicionado().add(cobra);
				
				System.out.println("Onde a cobra está [1] Terra [2] Água");
				localCobra = scanner.nextInt();
				
				cobra.rastejar(localCobra);
				break;

			case 2:

				System.out.println("Qual o nome: ");
				String nomeTartaruga = scanner.next();
				scanner.nextLine();
				System.out.println("Qual o sexo: [1] Fêmea [2] Macho");
				int sexoTartaruga = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Qual a cor: ");
				String corTartaruga = scanner.next();
				scanner.nextLine();
				System.out.println("Qual o peso: ");
				int pesoTartaruga = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Qual tipo de proteção da pele da tartaruga?");
				String protecaoPeleTartaruga = scanner.nextLine();
				System.out.println("Esta com a cabeça dentro do casco [1]Sim [2]Não");
				cabecaDentroCasco = scanner.nextInt();
				scanner.nextLine();
				
				Tartaruga tartaruga = new Tartaruga(nomeTartaruga, sexoTartaruga, corTartaruga, pesoTartaruga,
						protecaoPeleTartaruga, cabecaDentroCasco);
				tartaruga.getReptilAdicionado().add(tartaruga);
				
				tartaruga.dormindo(cabecaDentroCasco);
				
				break;

			case 3:

				System.out.println("Saindo do programa...");

				break;

			default:
				System.out.println("Opção Inválida!");
			}

		} while (adicionarNovoReptil <= 3);

		scanner.close();
	}

}

