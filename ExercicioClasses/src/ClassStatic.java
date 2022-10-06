import java.util.Random;
import java.util.Scanner;

public class ClassStatic {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random sorteio= new Random();
			leia.nextLine();
			
			
			boolean acertou=false;
			int tentativas=3;
			int numeroSecreto=sorteio.nextInt(5)+1;
			long chute = 0;
			
			
			
			int tentativas1 = 0;
			double nota1 = lerNota(leia);
			
			double nota2 = lerNota(leia);
			
			double notaFinalAritmetica = mediaAritmetica(nota1, nota2);
			double notaFinalPonderada = mediaPonderada(nota1, nota2);
			
			System.out.println("A sua média aritmética é " + notaFinalAritmetica);
			System.out.println("A sua média ponderada é " + notaFinalPonderada);
			
			leia.close();
		}
		
		public static double mediaAritmetica(double nota1, double nota2) {
			double media = (nota1 + nota2) / 2;
			return media;
		}
		
		public static double mediaPonderada(double nota1, double nota2) {
			double media = ((nota1 * 2) + (nota2 * 3)) / (2 + 3);
			return media;
		}
		
		public static double lerNota(Scanner teclado) {		
			System.out.println("Insira uma nota ");
			double nota = teclado.nextDouble();
			
			return nota;
		}

	}

