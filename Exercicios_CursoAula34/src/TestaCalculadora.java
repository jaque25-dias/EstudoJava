import java.util.Scanner;

public class TestaCalculadora {

	public static void main(String[] args) {
	
	MinhaCalculadora calculo = new MinhaCalculadora();
	int escolha;
	int n1, n2;
	
	Scanner leia= new Scanner(System.in);
    
	do {
	System.out.println(" ~~~~~~~~~~~~~~Olá seja bem vindo a calculadora Virtual~~~~~~~~~~~~~~~~~~~~ ");
	System.out.println(" Digite o 1º número da operação: ");
	n1 = leia.nextInt();
	System.out.println(" Digite o 2º número da operação: ");
	n2 = leia.nextInt();
	System.out.println(" Qual o calculo que você deseja realizar:"
			+ " [1]Somar [2]Subtrair [3]Dividir [4]Multiplicar [5] potência [6]Encerrar ");	
	
	System.out.println(" Escolha uma das operações para começar ");
	escolha = leia.nextInt();
	
	switch (escolha) {
	case 01:
		
		System.out.print("O valor da soma é : " +calculo.soma(n1, n2));
		System.out.println();
		break;
	
    case 02:
    	
		System.out.print("O valor da subtração é : "+calculo.subtrair(n1, n2));
		System.out.println();
		break;
		
    case 03:
    	System.out.print("O valor da divisão é : "+calculo.dividir(n1, n2));
    	System.out.println();
    	break;
		
    case 04:
    	System.out.print("O valor da multiplicação é : "+calculo.multiplicar(n1, n2));
    	System.out.println();
    	break;
    case 05:
    	System.out.println("O valor da potencia é: "+calculo.calcularPotencia(n1, n2));
    	System.out.println();
    	break;
    case 06:
    	System.out.print(" Calculadora encerrada !!!");
    	System.out.println();
    	break;
	default:
		System.out.println("Opção inválida !!! ");
		break;
	}
		
	}while(escolha<6);
	}
	}	
