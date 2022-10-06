
public class Exercicio12 {

	public static void main(String[] args) {
		


		 int n = 10; // tamanho do vetor
		 int a[] = new int [n]; // declarando q o vetor de numeros inteiros "a" de tamanho "n"
         int i; // iniciando a posicao i;
         int soma = 0; // declara e inicializa a soma dos elementos armenazenados no vetor
         
		
         
         for (i=0; i<n; i++) {
        	 a[i] = (int)Math.round(Math.random()* 10); // gera um numero aleatorio no intervalo 0 ate 100
        	 
        	 soma = soma + a[i]; // soma o decimo elemento do vetor
         }
	     
         
         System.out.println("O numero escolhido foi " + n);
         System.out.println("A soma dos elementos é " + soma);
	}
}
