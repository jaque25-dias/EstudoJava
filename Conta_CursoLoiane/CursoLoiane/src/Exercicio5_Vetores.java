import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio5_Vetores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] vetorA = new int[4];
		double[] vetorB = new double[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor da Posição : " + i);
			vetorA[i] = leia.nextInt();

			vetorB[i] = Math.sqrt(vetorA[i]);

		}
		System.out.println("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("##,##.##");
		
		
		System.out.println("Vetor B = ");
		for (int i=0; i<vetorB.length; i++) {
			System.out.print(df.format(vetorB[i])+ " ");
		}
		System.out.println();
		
	}

}
