import java.util.Scanner;

//17) Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
//80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
//o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.
public class MultaCarro {
  public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Velocidade do carro- Multa ");
	System.out.print("Qual a velocidade do carro ? ");
	float velocidadeDoCarro = leia.nextFloat();
	float multa = (velocidadeDoCarro - 80) * 5;

	if (velocidadeDoCarro > 80) {
		System.out.println(" Sua velocidade é de  " + velocidadeDoCarro +
				"Você está acima do permitido "+
				" Você foi multado em R$ : " + multa);
	} else {
		System.out.println("Parabéns você foi prudente e não teve nenhuma multa nesta viagem!");

		leia.close();
	}
  }
}
