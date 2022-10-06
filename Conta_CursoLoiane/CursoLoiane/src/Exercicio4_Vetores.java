import java.util.Scanner;

public class Exercicio4_Vetores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor da Posição : " + i);
			vetorA[i] = leia.nextInt();

			vetorB[i] = vetorA[i] * vetorA[i];

		}
		System.out.println("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Vetor B = ");
		for (int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		
		
	}

}
