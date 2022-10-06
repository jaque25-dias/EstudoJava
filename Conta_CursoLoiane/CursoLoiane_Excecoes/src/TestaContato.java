import java.util.Scanner;

public class TestaContato {

	public static void main(String[] args) {
	
		
		Scanner leia = new Scanner(System.in);
	
		Agenda agenda = new Agenda();
		
		int escolha = 1;
		
		while(escolha !=3) {
			escolha= obterEscolhaMenu(leia);

		if (escolha == 1) {
			consultarContato(leia, agenda);
			
		} else if (escolha == 2) {
            adicionarContato(leia, agenda);
	}
	}
	}
	
	public static void consultarContato(Scanner leia, Agenda agenda) {
		String nomeContato = leInformacaoString(leia, "Entre com o nome do contato a ser pesquisado");
		try {
			if (agenda.consultaContatoPorNome(nomeContato) >= 0) {
				System.out.println("Contato já existe na agenda"+agenda);
			}
		} catch (ContatoNaoExisteException ex) {
			System.out.println(ex.getMessage());

		}
	}
	public static void adicionarContato(Scanner leia, Agenda agenda) {
	
		try {
		System.out.println("Criando um contato, entre com as informações");	
		String nome= leInformacaoString(leia, "Entre com o nome do contato");
		String telefone= leInformacaoString(leia, "Entre com o telefone do contato");
		String email=leInformacaoString(leia,  "Entre com o email do contato");
	    
		Contato contato = new Contato();
	    contato.setNome(nome);
	    contato.setEmail(email);
	    contato.setTelefone(telefone);
	    
	    System.out.println("Contato a ser criado: ");
	    System.out.println(contato);
	  
		agenda.adicionarContato(contato);
		
		} catch (AgendaCheiaExeption e) {
		  System.out.println(e.getMessage());
		 
		  System.out.println("Contatos da agenda");
		  System.out.println(agenda);
		  
		}
	}

	public static String leInformacaoString(Scanner leia, String msg) {
		System.out.println(msg);
		String entrada = leia.nextLine();
		return entrada;

	}

	public static int obterEscolhaMenu(Scanner leia) {

		boolean entradaValida = false;
		int escolha = 3;

		while (!entradaValida) {
			System.out.println("Escolha uma das opções: ");
			System.out.println("1- Consultar contato na agenda");
			System.out.println("2- Adicionar Contato na agenda");
			
			try {
				String entrada = leia.nextLine();
				escolha = Integer.parseInt(entrada);

				if (escolha == 1 || escolha == 2) {
					entradaValida = true;
				} else {
					throw new Exception("Entrada inválida");
				}
			} catch (Exception e) {
				System.out.println("Entrada inválida, digite novamente\n");
			}
		}
		return escolha;
	}
}
