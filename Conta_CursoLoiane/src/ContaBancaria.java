import java.util.Scanner;

public class ContaBancaria {

	protected  String nomeCliente;
	protected int numConta;
	protected static double saldo;
	 
	static Scanner leia= new Scanner(System.in);
	public ContaBancaria(String nomeCliente, int numConta, double saldo) {
	
	}
	public ContaBancaria() {
		
	}	
	//o saldo não pode ficar negativo
	
	public boolean sacar(double valor) {
		
		System.out.println("Saldo anterior "+saldo);
		if ((saldo - valor) >=0){
	     saldo -=valor;
	     System.out.println("Realizando um saque "+valor);
	     return true;	
		 }
		System.out.println("Não é possivel realizar o saque. ");
		return false;	
	}
		
	public double depositar(double valor) {
		return saldo+=valor;
		
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public static double getSaldo() {
		return saldo;
	}
	public static void setSaldo(double saldo) {
		ContaBancaria.saldo = saldo;
	}
	@Override
	public String toString() {
		String info = " ContaBancaria[ ";
		info += "Nome do Cliente: " +nomeCliente;
		info += " ; numero da Conta : " +numConta;
		info += "; Saldo : " +saldo;
		info += "] " ;
		
		return info;
	}
	
	public static void infoCliente() {
	
	System.out.println("Digite o nome Cliente:");
	String nome= leia.next();
	System.out.println("Número da conta do Cliente");
	int Conta = leia.nextInt();
	System.out.println("Saldo inicial: ");
}
}
