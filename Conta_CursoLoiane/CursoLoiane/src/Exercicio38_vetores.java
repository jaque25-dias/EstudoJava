import java.util.Scanner;

public class Exercicio38_vetores {
public static void main(String[] args) {
	
	      Scanner ler = new Scanner(System.in);

	      int n = 10;
	      int a[] = new int[n];
	      int b[] = new int[n];
	      int i, j, sm;

	      for (i=0; i<n; i++) {
	        System.out.printf("Informe o %2do. elemento de %d: ", (i+1), n);
	        a[i] = ler.nextInt();
	      }

	      for (i=0; i<n; i++) {
	        sm = 0;
	        for (j=i; j<n; j++) {
	          sm = sm + a[j];
	        }
	        b[i] = sm;
	      }

	      for (i=0; i<n; i++) {
	        System.out.printf("\na[%d] = %2d   b[%d] = %2d", i, a[i], i, b[i]);
	      }

	      System.out.printf("\n");
	    }

	}