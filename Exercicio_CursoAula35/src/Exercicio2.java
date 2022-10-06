//Escreva	um	método recursivo e	estático	que	receba	um	número	inteiro	
//positivo	N	e	calcule	o	somatório	dos	números	de	1 a N

public class Exercicio2 {

	public static int soma (int n) {
		if (n==0) {
			return 0;
		}else {
		return n + soma (n-1);
	}
}
}