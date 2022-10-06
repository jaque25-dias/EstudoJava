package Encapsulamento;

import java.util.Scanner;

public class MainEncapsulamento {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ControleRemoto controle = new ControleRemoto();

		int resposta;
		do {
			System.out.println("****Menu****");
			System.out.println("1 - Alterar volume. ");
			System.out.println("2 - Modo de reprodução. ");
			System.out.println("3 - Exibir Menu ");
			System.out.println("4 - Fechar Menu. ");
			resposta = scanner.nextInt();

			switch (resposta) {
			case 1: {

				System.out.println("Deseja alterar o volume ? [1] Aumentar Volume [2] Diminuir Volume");
				int volume = scanner.nextInt();
				if (volume == 1) {
					controle.maisVolume();
					System.out.println("Aumentar Volume");
				} else if (volume == 2) {
					controle.menosVolume();
					System.out.println("Diminuir Volume");

				} else {
					System.out.println("Não foi possível alterar o volume.");
				}
			} System.out.println(controle);
				break;
			case 2: {
				System.out.println("Deseja tocar ? Sim ou Não");
				String modoReprodução = scanner.nextLine();
				if (modoReprodução == "Sim") {
					controle.setTocando(modoReprodução);
					System.out.println("TV ligada e reproduzindo. ");
				} else {
					controle.setTocando(modoReprodução);
					System.out.println("TV Pausada. ");
				}
			} System.out.println(controle);
				break;
			case 3: {
				controle.abrirMenu();
				System.out.println(controle);
				
			} break;
			
			case 4: {
				controle.fecharMenu();
				System.out.println(controle);
				System.out.println("Menu fechado");
			}

			}
			break;
		} while (resposta <4);
		scanner.close();
	}
}
