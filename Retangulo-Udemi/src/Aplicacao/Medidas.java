package Aplicacao;

import java.util.Scanner;

import Entidades.Retangulo;

public class Medidas {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite as medidas : ");
		retangulo.altura = leia.nextDouble();
		retangulo.largura = leia.nextDouble();
		
		System.out.println("Area : " + String.format("%.2f" ,retangulo.area()));
		
		System.out.println("Perimetro "+ String.format("%.2f",retangulo.perimetro()));
		
		System.out.println("Diagonal "+ String.format("%.2f",retangulo.diagonal()));
			
		leia.close();			
	}

}
