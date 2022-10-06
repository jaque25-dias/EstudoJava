import java.util.ArrayList;
import java.util.Scanner;

public class TestaRestaurante {
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
        
        System.out.println("Olá Seja Bem-vindo ao Restaurante Casa de mãe ");
		
        System.out.println("Digite o nome do Cliente: " );
		String nome = leia.nextLine();
		
		Pedido pedido = new Pedido(nome);
		
		int menu;
		  do{
			System.out.println("Selecione uma opção para começar o pedido: ");
			System.out.println("1 - Adicione um lanche ao pedido ");
			System.out.println("2 - Adicione uma bebida ao pedido ");
			System.out.println("3 - Deseja incluir a taxa de serviço ? ");
			System.out.println("4 - Fechar o pedido ");
			menu = leia.nextInt();
		
		
		switch (menu) {
		case 1:
			System.out.println("Digite o nome do lanche escolhido: ");
			String nomeLanche = leia.next();
		    System.out.println();
			System.out.println("Digite o preço do lanche: ");
			double precoLanche= leia.nextDouble();
			System.out.println();
			System.out.println("Digite o peso do lanche: ");
			int pesoLanche = leia.nextInt();
			System.out.println();
			System.out.println("Digite o ingrediente do lanche escolhido: ");
			String ingredienteLanche = leia.next();		
				
			Lanche novoLanche = new Lanche(nomeLanche,precoLanche,pesoLanche, ingredienteLanche);
					
			pedido.adicionarItem(novoLanche);
			
			break;
        case 2: 
//        	
        	System.out.println("Digite o nome da bebida escolhida: ");
			String nomeBebida = leia.next();
			System.out.println();
			System.out.println("Digite o preço da Bebida: ");
			double precoBebida= leia.nextDouble();
			System.out.println();
			System.out.println("Digite o volume do lanche: ");
			int volumeBebida = leia.nextInt();
			System.out.println();
			
			System.out.println("Qual o tipo de bebida Alcoólica ? [1] sim |[2] não " );
			int tipoBebida = leia.nextInt();
			System.out.println("Qual  a sua idade ? ");
			int idade=leia.nextInt();
			
			if (tipoBebida==1 && idade>=18){
				System.out.println("Você pode comprar bebida alcoolica !");
			}else {
				System.out.println("Você não pode comprar bebida alcoolica !");
			}
//     		String nomeItem, double preco, int volume, boolean bebidaAlcoolica
			
		Bebida novaBebida = new Bebida(nomeBebida, precoBebida, volumeBebida, tipoBebida==1);
			
			pedido.adicionarItem(novaBebida);
				
			break;
	
        case 3:
        	System.out.println("Deseja incluir a taxa de serviço? 1 -Sim | 2 - Não ");
        	
        	int taxa = leia.nextInt();
 
        if(taxa==1) {
        
        	pedido.taxaDeServico= true;
       
    		} else {
    		pedido.taxaDeServico = false;
    		}
        break;
    		default:
    
    	case 4:	   	 
	    System.out.println("Fechar o pedido ");
        pedido.gerarFatura();	
	    break;
		}	
		
        }while (menu < 4);
		
		leia.close();
}
}