import java.util.Scanner;

public class TestaVariaveis{
    public static void main(String[] args) { 
      
    	Scanner leia = new Scanner(System.in);
    	
        System.out.println("Qual seu nome ? ");
        String nome = leia.nextLine();
        
        System.out.println("Um prazer em te conhecer" +nome);
        String resposta = leia.next();

    }
}