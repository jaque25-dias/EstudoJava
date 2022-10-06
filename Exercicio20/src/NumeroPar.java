import java.util.Scanner;

public class NumeroPar {
public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	System.out.println("informe um número inteiro");
	int numero = leia.nextInt();
	if ((numero %2) ==0)
	{
		System.out.println("O número " + numero);
	}
	else {
		System.out.println("O numero " +numero+ " é um numero par");
	}
  leia.close();	
}
}