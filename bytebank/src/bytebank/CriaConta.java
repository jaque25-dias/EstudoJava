package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		// Criar conta New conta(primeira conta é maior ou igual a R$100)
		//
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		primeiraConta.saldo += 100;
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;

		System.out.println(primeiraConta.saldo);
		System.out.println(primeiraConta.saldo);
		System.out.println("primeira conta tem " + primeiraConta.saldo);
		System.out.println("segunda conta tem " + segundaConta.saldo);
		System.out.println("referenciar: " + primeiraConta);
	}

}
