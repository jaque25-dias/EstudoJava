import java.util.Scanner;

public class TestaControleRemoto {

	public static void main(String[] args) {
		Scanner Scanner= new Scanner(System.in);
		
		ControleRemoto javaTeste = new ControleRemoto();
		javaTeste.ligar();
		
		int menu= 0;
		
		while (menu >=4) {
		System.out.println("~~~~~~~~~Menu Controle Remoto~~~~~~~~");
		System.out.println("[1] Abrir Menu [2]Alterar volume [3]Modo de reprodução [4]Fechar menu");
		
		
		switch (menu) {
		case 01: 
		{
	
		javaTeste.abrirMenu();
			
		}
		case 02: 
		
			
			System.out.println("Deseja alterar o volume ? [1]Aumentar [2]Diminuir");
			int volume = Scanner.nextInt();
			
			if (volume ==1) {
				javaTeste.maisVolume();
				System.out.println("Volume foi aumentado ");
			} else if (volume == 2) {
				javaTeste.menosVolume();
			} else {
			
				javaTeste.setVolume(volume);
				
			}
       case 03: 
			
			System.out.println("Qual o modo de reprodução ? ");
			String modoReproducao = Scanner.next();
				
			
       
       case 04: 
			
			System.out.println("Fechar o menu");
			javaTeste.fecharMenu();
				
			
		default:
			System.out.println("Controle remoto funcionando!!! " );
		}		
	}
	}
}