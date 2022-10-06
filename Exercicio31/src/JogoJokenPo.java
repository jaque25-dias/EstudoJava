//
//31) [DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)
//

import java.util.Scanner;

public class JogoJokenPo {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int jogador=0, computador;
                		
		while (jogador != 4) {
			System.out.println("~~~~~~~~~~Jogo JOKENPo");
			System.out.println("1 -Pedra  ");
			System.out.println("2 - Papel  ");
			System.out.println("3 -Tesoura  ");
			System.out.println("4 -  sair ");

			// Lógica do jogador

			jogador = leia.nextInt();

			switch (jogador) {
			case 1:
				System.out.println("O jogador escolheu Pedra! ");

				break;
			case 2:
				System.out.println("O jogador escolheu Papel !");
				break;

			case 3:
				System.out.println("O jogador escolheu Tesoura ! ");
				break;

			case 4:
				System.out.println(" Jogo finalizado com sucesso!! ");

				break;

			default:
				System.out.println(" Opção inválida!! ");

				break;
			

			}
			if (jogador>0 && jogador<4) {
				
			// Lógica do computador

			computador = (int) ((Math.random()) * 3 + 1);
			
				System.out.println();
				switch (computador) {
				case 1:
					System.out.println("O computador escolheu Pedra!!");

					break;
				case 2:
					System.out.println("O computador  escolheu Papel!! ");
					break;

				case 3:
					System.out.println("O computador  escolheu Tesoura!!");
					break;

				case 4:
					System.out.println(" Jogue novamente, Escolha umas das opções!! ");

					break;
				}

				// Lógica para determinar o vencedor

				if (jogador == computador) {
					System.out.println("Jogo Empate!!");
				} else {
					if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)

							|| (jogador == 3 && computador == 2)) {

						System.out.println("Jogador Venceu!!! ");
					} else {
						System.out.println("O computador Venceu!!!");
					}
				}	
			}
			
		}
		
		leia.close();
}	
}

