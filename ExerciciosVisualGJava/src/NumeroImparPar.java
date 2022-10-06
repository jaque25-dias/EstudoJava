import java.util.Scanner;

//Var
//N: inteiro
//
//Inicio
// Escreva ("Digite um número: ")
// Leia (N)
// Se (N % 2 = 0) entao
//    Escreva ("o numero: ", N , "é par")
// senao
//     ("o numero: ", N ," é impar" )
//

public class NumeroImparPar {
	
public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	
	System.out.println("Número impar ou Par");
	System.out.println();
	System.out.println("Informe um número");
	int numero = leia.nextInt();

	if (numero%2 <= 0){
		System.out.println("O numero informado "+ numero+ " é um número Par");
	}else{
	 System.out.println("O numero informado "+ numero+ " é um numero Impar");
	}
	
	System.out.println("Fim");
leia.close();
		
}
}

