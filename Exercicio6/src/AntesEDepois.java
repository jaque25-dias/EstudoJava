import java.util.Scanner;

public class AntesEDepois {
public static void main(String[] args) {
	Scanner leia= new Scanner(System.in);
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("Antecessor e Sucessor");
	System.out.println("informe um numero ");
	int numero = leia.nextInt();
	  int antecessor = numero -1;
	  int sucessor = numero +1;
	  
	  System.out.println("O antecessor de " +numero+ " é " +antecessor+ " o seu sucessor é " +sucessor+".");
	  
	  leia.close();
	
}

}
