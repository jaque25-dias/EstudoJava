
//   Crie um programa que leia o tamanho de três segmentos de reta. 
//	 Analise seus comprimentos e diga se é possível formar um triângulo com essas 
//	 retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento 
//	 de cada lado deve ser menor que a soma dos outros dois
//

import java.util.Scanner;

public class ExercicioTriangulo {
 public static void main(String[] args) {
	 
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Informe o tamanho do lado 1  ");
	int lado1 = leia.nextInt();
			
	System.out.println("Informe o tamanho do lado 2 ");
	int lado2 = leia.nextInt();
	
	System.out.println("Informe o tamanho do lado 3 ");
	int lado3 = leia.nextInt();
	
	boolean l1 = lado1 < lado2 + lado3;
	boolean l2 = lado2 < (lado1 + lado3);
	boolean l3 = lado3 < (lado1+ lado2);
	
	if ((l1) && (l2) && (l3)) {
		System.out.println("Tudo certo! Os três segmentos podem formar um triângulo.");
	} else {
				System.out.println("Não é possível formar um triângulo a partir dos três segmentos informados.");
			}
 }
}