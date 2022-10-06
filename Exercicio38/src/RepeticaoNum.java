
//38) Escreva um programa que mostre na tela a seguinte contagem: 
//6 7 8 9 10 11 Acabou!
//

public class RepeticaoNum {

	public static void main(String[] args) {

		int i=0;
		
		// for (i<12; i=0; ++i )

		while (i<=10) {
			System.out.println(i++);
			//++ (antes incrementa depois printa)
			// ++ (depois mostra na tela depois encrementa).
		}
				
		System.out.print("Acabou a contagem!! ");
	}
}