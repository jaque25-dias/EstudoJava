import java.util.Scanner;

public class Exercicio19_Vetores {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);

	      int n = 10;
	      double nota1[] = new double[n];
	      double nota2[] = new double[n];
	      double resultado[] = new double[n];
	      int i;

	      for (i=0; i<n; i++) {
	        System.out.printf("Informe as notas do 1º aluno ", (i+1), n);
	        System.out.printf("1ª Nota  é = ");
	        nota1[i] = leia.nextDouble();
	        System.out.printf("2ª Nota é = ");
	        nota2[i] = leia.nextDouble();

	        resultado[i] = (nota1[i] + nota2[i]) / 2;

	        System.out.println(" | ");
	      }

	      System.out.printf("Aluno 1ª Nota 2ª Nota Media Situacao.");
	      System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	      
	      for (i=0; i<n; i++) {
	        System.out.printf("\n%5d %7.2f %7.2f %5.2f ", (i+1), nota1[i], nota2[i], resultado[i]);
	        if (resultado[i] >= 7.0) {
	        	System.out.printf("aprovado");
	        }
	          else {
	        	  System.out.printf("reprovado");
	          }
	     
	      System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	}
}
