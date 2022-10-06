
// 40- Crie um aplicativo que mostre na tela a seguinte contagem:
//		  0 3 6 9 12 15 18 0 Acabou
public class ContagemRepeticao {
	public static void main(String[] args) {
		
		int i=0;

		while (i<=500) {
			System.out.println(+-i);
			i= i+50;
			//++ (antes= incrementa depois printa)
			// ++ (depois= mostra na tela depois encrementa).
		}		
		System.out.print("Acabou ");
	}
}