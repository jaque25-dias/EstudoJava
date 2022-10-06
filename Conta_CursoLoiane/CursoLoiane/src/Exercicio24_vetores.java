import java.util.Scanner;

public class Exercicio24_vetores {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

	      int n = 10;
	      int a[] = new int[n];
	      int i, j;
	      boolean simPalindromo;

	      for (i=0; i<n; i++) {
	        System.out.printf("Informe %2do. elemento de %d: ", (i+1), n);
	        a[i] = leia.nextInt();
	      }

	      i = 0; // posicoes iniciais do vetor
	      j = (n-1); // posicoes finais do vetor
	      simPalindromo = true; // flag que indicara se o vetor eh palindromo ou nao
	      while ((i < j) && (simPalindromo == true)) {
	        if (a[i] != a[j])
	        	simPalindromo= false; // nao é palindromo
	        else {
	          i = i + 1;
	          j = j - 1;
	        }
	      }

	      if (simPalindromo== true)
	         System.out.printf("\nOs elementos do vetor formam um palindromo.\n");
	      else System.out.printf("\nOs elementos do vetor \"nao\" formam um palindromo.\n");
	}

}
