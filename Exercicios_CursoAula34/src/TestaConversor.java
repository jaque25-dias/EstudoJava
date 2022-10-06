import java.util.Scanner;

public class TestaConversor {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		int escolha=0;
        int numero;
     
        do {
		System.out.println(" ~~~~~~~~~~~~~~Seja bem vindo ao Conversor do tempo virtual~~~~~~~~~~~~~~~~~~~~ ");
		System.out.println(" Digite o número : ");
		numero = leia.nextInt();	
		
		System.out.println(" Qual o tipo de conversão você deseja realizar:"
				+ " [1]Minuto [2]Hora [3]Dia [4]Semana [5]Mês  [6]Ano [7]Fechar conversor" );	
		escolha= leia.nextInt();
		
		switch (escolha) {
		case 01:
	    	
			System.out.print("O valor  da conversão é : " +ConversaoDeUnidadesDeTempo.converterMin(numero)+ " minuto(s)");
			System.out.println();
			break;
       case 02:
			System.out.print("O valor  da conversão é : " +ConversaoDeUnidadesDeTempo.converterHora(numero)+ " h");
			System.out.println();
			break;
			
       case 03:
			System.out.print("O valor  da conversão é : " +ConversaoDeUnidadesDeTempo.converterDia(numero) + " dia(s)");
			System.out.println();
			break;
       case 04:
	    	
			System.out.print("O valor  da conversão é : " +ConversaoDeUnidadesDeTempo.converterSemana(numero) + " semana ");
			System.out.println();
			break;
       case 05:
	    	
			System.out.print("O valor  da conversão é : " +ConversaoDeUnidadesDeTempo.converterMes(numero));
			System.out.println();
			break;
       case 06:
	    	
			System.out.print("O valor  da conversão é : " +ConversaoDeUnidadesDeTempo.converterAno(numero));
			System.out.println();
			break;
       case 07:
	    	
			System.out.print("Conversor fechado!!");
			System.out.println();
			break;
       default:
   		System.out.println("Opção inválida !!! ");
   		break;
   	}
	}while(escolha<7);
	}
}