import java.util.Scanner;

public class Exercicio11_Vetores {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		 
		  int[] vetorA = new int[10];
		  
		  int n = 1;
		  
		  int a[] = new int[n]; // declarando o vetor de numeros inteiros "a" de tamanho "n"
	      
		  int i; // indice (ou posicao)
	      
		  int numpar = 0; // declarando e inicializando o contador de numeros pares

	      for (i=0; i<n; i++) {
	      a[i] = (int)Math.round(Math.random() * 100); // gera um numero aleatorio no intervalo de 0 ate 100

	        if ((a[i] % 2) == 0) {
	           numpar = numpar + 1; // contando os numeros pares
	           System.out.println("O numero gerado foi " + numpar);
	        }
	        else System.out.println("O numero  é : " + a[i]);
	      }

	      System.out.println("O numero " +  numpar + " é par.");
			}
}