import java.util.Scanner;

public class Exercici023_Vetores {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);

	      int n = 10;
	      int a[] = new int[n];
	      int i;
	      boolean todosNumerosPares;

	      for (i=0; i<n; i++) {
	        System.out.printf("Informe %2do. elemento de %d: ", (i+1), n);
	        a[i] = leia.nextInt();
	      }

	      todosNumerosPares = true; // flag que indicara se todos o elementos do vetor sao pares ou nao
	      for (i=0; ((i < n) && (todosNumerosPares == true)); i++) {
	        if ((a[i] % 2) != 0)
	        	todosNumerosPares = false; // encontrou um impar
	      }

	      if (todosNumerosPares== true)
	         System.out.printf("\nTodos os elementos do vetor sao pares.\n");
	      else System.out.printf("\nNem todos os elementos do vetor sao pares.\n");
	
	}

}
