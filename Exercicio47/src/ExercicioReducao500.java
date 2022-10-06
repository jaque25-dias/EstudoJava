
//47) Desenvolva um aplicativo que mostre na tela 
//o resultado da expressão 500 + 
//450 + 400 + 350 + 300 + ... + 50 + 0
public class ExercicioReducao500 {

public static void main(String[] args) {
		
		int i=0;
		
		while (i>=500) {
			System.out.println(i);
			i= i+50;
			//++ (antes incrementa depois printa)
			// ++ (depois mostra na tela depois encrementa).
		}		
		System.out.print("Acabou a contagem!!!");
	}
}
