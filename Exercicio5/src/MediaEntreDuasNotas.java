import java.util.Scanner;

public class MediaEntreDuasNotas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Iniciando a média de notas");
		System.out.println("Informe a disciplina a ser avaliada");
		String disciplina = leia.nextLine();
		System.out.println("informe a primeira nota");
		float primeiraNota = leia.nextFloat();
		System.out.println("informe a segunda nota");
		float segundaNota = leia.nextFloat();
		float media = (primeiraNota + segundaNota)/ 2;
		System.out.println("Na disciplina " +  disciplina + " a média entre as duas notas é " 
		+ media);
		
		leia.close();
	}	
}