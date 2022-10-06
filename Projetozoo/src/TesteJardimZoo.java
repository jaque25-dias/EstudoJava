import java.util.Scanner;

public class TesteJardimZoo {

	public static void main(String[] args) {
	
	Scanner leia= new Scanner(System.in);
	
	
	int escolha=0;
	do {
	System.out.println("~~~~~~~~~~~~~~~~~~~~Jardim Zoo~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("Escolha um animal para saber mais (1)CAMELO (2)TUBARAO (3)URSO-DO-CANADÁ" );
	escolha=leia.nextInt();
	
	switch (escolha) {
	case 01:
		Mamifero camelo= new Mamifero();
		camelo.setNome("Camelo");
		camelo.setComprimento("3mts");
		camelo.setCor("Marrom");
		camelo.setVelocidade(2.0);
		System.out.println(camelo);
		break;
		
    case 02:
    	Peixe tubarao = new Peixe();
    	tubarao.setNome("Tubarão");
    	tubarao.setComprimento("3mts");
    	tubarao.setVelocidade(2.0);
    	System.out.println(tubarao);
    		
		break;
    case 03:
		Urso ursoCanada = new Urso();
		ursoCanada.setCor("Castanho");
		ursoCanada.setAlimento("Mel");
		System.out.println(ursoCanada);
		break;

	default:
		break;
	}
	}while(escolha>=3);	
	}
}