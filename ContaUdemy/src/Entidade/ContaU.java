package Entidade;

public class ContaU {
	
	private String titular;
	private int numeroConta;
	private double saldo;
		
	public ContaU(String titular, int numeroConta, double depositoInicial) {
		this.titular = titular;
		this.numeroConta = numeroConta;
		depositar(depositoInicial);
	}
	public ContaU(String titular, int numeroConta) {
		this.titular = titular;
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void depositar(double depositar) {
		saldo += depositar;
	}
	
	public void saque (double saque) {
		saldo -= saque + 2.00;
	}
	
	public String toString() {
		return ("\n" )+
				 " Olá " +titular+
				" número da conta: "+numeroConta
				+ " seu saldo é: " 
		        + String.format("%.2f", saldo);						
	}
}