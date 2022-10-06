//Importação da classe Scanner, usada para ler dados do usuário
import java.util.Scanner;

public class TestacalculoIMC {
    public static void main(String[] args) {
        // Objeto responsável por ler inputs do Usuario
        Scanner scanner = new Scanner(System.in);
    
        String nome;
        double altura;
        double massa;
        
        System.out.println( " Vamos calcular seu IMC a ser alcançado  !!! ");
        System.out.println( " ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
        System.out.println(" Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.println(" Digite seu peso em KG: ");
        massa = scanner.nextDouble();
        System.out.println(" Digite sua altura em metros: ");
        altura = scanner.nextDouble();
        
        Pessoa pessoa = new Pessoa(nome, massa, altura);
        pessoa.calculaImc(); 
        
        System.out.println(" Olá" + pessoa.getNome());
        System.out.println( " O seu  IMC é " + pessoa.getImc());
        System.out.println( " Sua categoria de peso é: " + pessoa.retornaCategoriaDePeso());
        
    }

}