import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner leia= new  Scanner(System.in);
		Operacao operacao = null;
		
		System.out.println("Comece a usar a calculadora Enum Java");
		System.out.println("Entre com o primeiro numero");
		int A= leia.nextInt();
		System.out.println("Entre com o segundo numero");
		int B= leia.nextInt();


		for (Operacao op : Operacao.values()) {
				System.out.print(A + " ");
				System.out.print(op.toString() + "");
				System.out.print(B + " = ");
				System.out.println(op.executarOperacao(A, B));
				
		
			}
		
		


		}
}
	
