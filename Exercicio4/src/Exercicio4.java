import java.util.Scanner;
//Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
//entre eles.
//Ex:
//Digite um valor: 8
//Digite outro valor: 5
//A soma entre 8 e 5 é igual a 13.
public class Exercicio4 {
public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	System.out.println("Fazendo a somatoria ");
	System.out.println("Informe o primeiro número ");
	int primeiroNumero = leia.nextInt();
	System.out.println("Informe o segundo número ");
	int segundoNumero = leia.nextInt();
	int soma = primeiroNumero + segundoNumero;
	System.out.println("A soma dos dois valores é " + soma);
	leia.close();
}
}