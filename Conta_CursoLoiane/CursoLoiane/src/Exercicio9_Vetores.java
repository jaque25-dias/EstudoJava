import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio9_Vetores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		double[] vetorC = new double[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor da Posição : " + i);
			vetorA[i] = leia.nextInt();

		}
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Digite o valor da Posição : " + i);
			vetorB[i] = leia.nextInt();
		}
		
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i]/vetorB[i];
		}
		
		System.out.println("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		{
		System.out.println();
	}
		System.out.println("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
	
		DecimalFormat df = new DecimalFormat ("##,##.##");
				
		System.out.println("Vetor C = ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");	
	}

}
}
