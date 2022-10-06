import java.util.Scanner;

public class TesteBancoLoi {
	
     public static void main(String[] args) {
    			 
    Scanner leia= new Scanner(System.in);
    
    int escolha=0;
    System.out.println("Escolha a conta que deseja maiores informaçãoes[1] conta Poupança [2] Conta Especial");	 
    escolha= leia.nextInt();
    System.out.println();	 
  
    switch (escolha) {
	case 1:
    System.out.println("-------------Conta Poupança-------------");
    ContaPoupanca contaP= new ContaPoupanca();
    contaP.setNomeCliente("Jaqueline Dias");
    contaP.setNumConta(22222);
    contaP.setSaldo(1000);
    contaP.setDiaRendimento(13);
    contaP.depositar(200);
    contaP.realizarSaque(contaP, 100);
    contaP.calcularNovoSaldo(0.2);   
    System.out.println("---------Operação encerrada com sucesso---------");
     	break;
     case 2:
     System.out.println("-------------Conta Especial-------------");
    	    ContaEspecial contaE= new ContaEspecial("Cliente", 0001, 1000, 200);
    	    contaE.setNomeCliente("Novo Cliente");
    	    contaE.setNumConta(33333);
    	    contaE.setLimite(200);
    	    contaE.depositar(1000);
    	    contaE.sacarEspecial(100);
    	    contaE.sacar(800);
    	    contaE.realizarSaque(contaE, 1000);
    	    System.out.println(contaE);
    	    System.out.println("--------Operação encerrada com sucesso---------");
 	default:
 		break;
 	}
    
    }
}