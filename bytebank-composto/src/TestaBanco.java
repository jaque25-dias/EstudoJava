public class TestaBanco {

	public static void main(String[] args) {
		Cliente Jaqueline = new Cliente();
		Jaqueline.nome = "Jaqueline Dias";
		Jaqueline.cpf = "000.111.222-33";
		Jaqueline.profissao = "Programadora Jr";

		Conta contaDeJack = new Conta();
		contaDeJack.saldo = 5000;
		contaDeJack.agencia = 2034;
		contaDeJack.conta = 2534;

		contaDeJack.titular = Jaqueline;
		System.out.println("Olá " + Jaqueline.nome);
		System.out.println("O nº de CPF: " + Jaqueline.cpf);
		System.out.println("A profissão é : " + Jaqueline.profissao);
		System.out.println("Seu saldo é : " + contaDeJack.getSaldo());
		System.out.println("Sua agência é " + contaDeJack.agencia + " e conta " + contaDeJack.conta);
		System.out.println(" Parabéns, conta de Jaqueline criada com sucesso!!!");
	   // Inseriu novo cliente Ariane
		Cliente Ariane = new Cliente();
		Ariane.setNome ("Ariane");
	    Ariane.setCpf ("222.222.222.44");
		Ariane.setProfissao ("Programadora Jr");
		// Insere informações da class Conta
		Conta contaDaAriane = new Conta();
		contaDaAriane.saldo= 5000;
		contaDaAriane.agencia = 2031;
		contaDaAriane.conta = 6045;
		// Imprime as informações do cliente Ariane				
		contaDaAriane.titular = Ariane;
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Olá " + Ariane.nome);
		System.out.println("O nº de CPF: " + Ariane.cpf);
		System.out.println("A profissão é : " + Ariane.profissao);
		System.out.println("Seu saldo é : " + contaDaAriane.getSaldo());
		System.out.println("Sua agência é " + contaDaAriane.agencia + " e conta " + contaDaAriane.conta);
		System.out.println(" Parabéns, Conta da Ariane criada com sucesso!!!");
		//Inseriu novo cliente
		Cliente Anderson = new Cliente();
		Anderson.setNome ("Anderson");
	    Anderson.setCpf ("222.222.222.44");
		Anderson.setProfissao ("Programador Jr.");
		
		Conta contaDoAnderson = new Conta();
		contaDoAnderson.saldo = 5000;
		contaDoAnderson.agencia = 2031;
		contaDoAnderson.conta = 9056;
		
		contaDoAnderson.titular = Anderson;
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Olá " + contaDoAnderson.titular.getNome());
		System.out.println("O CPF é " + contaDoAnderson.titular.getCpf());
		System.out.println("Sua profissão é " + contaDoAnderson.titular.getProfissao());	
		System.out.println("Seu saldo é : " + contaDoAnderson.getSaldo());
		System.out.println("Sua agência é " + contaDoAnderson.agencia + " sua conta é " + contaDoAnderson.conta);
		System.out.println(" Parabéns, conta de Anderson criada com sucesso!!!");
		
		Cliente Wendel = new Cliente();
		Wendel.setNome ("Wendel");
	    Wendel.setCpf ("222.222.222.44");
		Wendel.setProfissao ("Programador JR");
		
		Conta contaDoWendel = new Conta();
		contaDoWendel.saldo = 5000;
		contaDoWendel.agencia = 2021;
		contaDoWendel.conta = 3645;
		
		contaDoWendel.titular = Wendel;
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Olá " + contaDoWendel.titular.getNome());
		System.out.println("O CPF é " + contaDoWendel.titular.getCpf());
		System.out.println("Sua profissão é " + contaDoWendel.titular.getProfissao());	
		System.out.println("Seu saldo é : " + contaDoWendel.getSaldo());
		System.out.println("Sua agência é " + contaDoWendel.agencia + " sua conta é " + contaDoWendel.conta);
		System.out.println(" Parabéns conta de Wendel criada com sucesso!!!");
	}	
}