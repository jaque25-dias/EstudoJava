
public class Exercicio29_vetores {

	public static void main(String[] args) {
		 int n = 10;
	      int a[] = new int[n];
	      int b[] = new int[n];
	      int c[] = new int[n*2];
	      int i, j;

	      for (i=0; i<n; i++) {
	        a[i] = (int)Math.round(Math.random() * 100);
	        b[i] = (int)Math.round(Math.random() * 100);
	      }

	      j = n; // primeira posicao da segunda metade de "c"
	      for (i=0; i<n; i++) {
	        c[i] = a[i]; // os primeiros elementos de "c" deverao receber os elementos de "a"
	        c[j] = b[i]; // os ultimos elementos "c" deverao receber os elementos de "b"
	        j = j + 1;
	      }

	      System.out.printf("Vetor 'a' \n");
	      for (i=0; i<n; i++) {
	        System.out.printf("%2d ", a[i]);
	      }

	      System.out.printf("\n\nVetor 'b' \n");
	      for (i=0; i<n; i++) {
	        System.out.printf("%2d ", b[i]);
	      }

	      System.out.printf("\n\nVetor 'c' \n");
	      System.out.printf("primeiros vetor 'a'____________ultimos vetor 'b' \n");
	      for (i=0; i<(2*n); i++) {
	        System.out.printf("%2d ", c[i]);
	      }

	      System.out.printf("\n");
		
		
		
	}

}
