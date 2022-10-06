import java.util.Random;

public class Exercicio1_matrizes {
	
	public static void main(String[] args) {

	
		int [] [] numerosAleatorios = new int [4] [4];
		
		Random numeroRandom = new Random();
		
		int maior = 0;
		int linha = 0;
		int coluna =0;
		
		for (int i= 0; i<numerosAleatorios.length; i++) {
			for (int j=0; j<numerosAleatorios[i].length; j++) {
			numerosAleatorios [i] [j] = numeroRandom.nextInt(10);
			if (numerosAleatorios[i] [j] > maior) {
			maior = numerosAleatorios[i] [j];
			linha= i;
			coluna=j;
			}
			}
			}
		System.out.println("Maior valor é  = " + maior);
		System.out.println("Linha é  = " + linha);
		System.out.println("Coluna é  = " + coluna);
		
			}
	}
