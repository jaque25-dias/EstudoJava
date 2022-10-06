
public class Cliente{
	
	private static int counter = 1;
	private int numeroAgencia=002;
	private int cpf;
	private String titular;
	private String email;
	public Cliente(int numeroAgencia, int cpf, String titular, String email) {
		this.numeroAgencia = numeroAgencia;
		this.cpf = cpf;
		this.titular = titular;
		this.email = email;
	}
	public int getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	} 
	}