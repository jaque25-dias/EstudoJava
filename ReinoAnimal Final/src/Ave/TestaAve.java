package Ave;

import java.util.Scanner;

public class TestaAve {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int adicionarNovaAve = 0;
		int local = 0;
		int cantar = 0;

		do {
			System.out.println("Qual Ave deseja adicionar?");
			System.out.println("[1] Pato [2] Papagaio [3] Sair");
			adicionarNovaAve = scanner.nextInt();

			switch (adicionarNovaAve) {
			case 1:

				System.out.println("Qual o nome: ");
				String nomePato = scanner.nextLine();
				scanner.next();
				System.out.println("Qual o sexo: ");
				int sexoPato = scanner.nextInt();
				scanner.next();
				System.out.println("Qual a cor: ");
				String corPato = scanner.nextLine();
				scanner.next();
				System.out.println("Qual o peso: ");
				int pesoPato = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Esse pato(a) voa?  [1]Sim  [2]Não");
				int voaPato = scanner.nextInt();
				if (voaPato == 1) {
					System.out.println("Esse pato voa! Então ele pode também migrar...");
				} else {
					System.out.println("Esse pato não voa!");
				}
				scanner.nextLine();
				System.out.println("Como são as penas do pato(a)");
				String penasPato = scanner.nextLine();

				Pato novoPato = new Pato(nomePato, sexoPato, corPato, pesoPato, voaPato, penasPato);
				novoPato.addAve(novoPato);

				System.out.println("Onde o pato está? [1] Água [2]Terra");
				local = scanner.nextInt();
				novoPato.nadar(local);

				break;

			case 2:

				System.out.println("Qual o nome: ");
				String nome = scanner.nextLine();
				scanner.nextLine();
				System.out.println("Qual o sexo: ");
				int sexo = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Qual a cor: ");
				String cor = scanner.nextLine();
				scanner.nextLine();
				System.out.println("Qual o peso: ");
				int peso = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Essa ave voa? [1]Voa [2]Não voa");
				int voa = scanner.nextInt();
				if (voa == 1) {
					System.out.println(
							"Esse Papaguaio voa, mantenha-o em um viveiro apropriado para evitar voo indesejado! ");
				} else {
					System.out.println("Esse Papagaio não voa!");
				}
				System.out.println("Tipo de Penas");
				String penas = scanner.nextLine();
				scanner.nextLine();

				Papagaio papagaio = new Papagaio(nome, sexo, cor, peso, voa, penas);
				papagaio.addAve(papagaio);

				System.out.println("O Papagaio está cantando? [1] Sim [2]Não");
				cantar = scanner.nextInt();
				papagaio.cantar(cantar);

				break;

			case 3:

				System.out.println("Saindo do programa...");

				break;

			default:
				System.out.println("Escolha inválida!!!");
			}

		} while (adicionarNovaAve <= 3);

		scanner.close();
	}

}
