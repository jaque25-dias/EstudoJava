import java.util.Scanner;
public class TamanhoTerreno {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
       
        System.out.println("Informe a largura do terreno em metros:");
        
        int largura = leia.nextInt();
        if(largura<=0) {
        	System.out.println("Largura inválida, informe outra medida para o terreno");
        } else {
        
        System.out.println("Informe o comprimento do terreno em metros:");
        int comprimento = leia.nextInt();
        
        int tamanho = largura*comprimento;
        
        if(comprimento<=0) {
        	System.out.println("Comprimento inválido, informe outra medida para o terreno");
        } else {
        
        if(tamanho <=100) {
            System.out.println(" A medida deste terreno é "+tamanho+ " em metros e é Popular!!!");
        }
        
        else if((tamanho >= 101) && (tamanho<=500)) {
            System.out.println(" A medida deste terreno é "+tamanho+ " em metros e é MASTER!!!");
       
        } else {
        	 System.out.println(" A medida deste terreno é "+tamanho+ " em metros e é Vip!!!");       
        	 }
            leia.close();
            
        }    
}
}
}