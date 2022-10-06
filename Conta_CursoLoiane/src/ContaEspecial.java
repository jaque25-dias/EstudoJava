
public class ContaEspecial extends ContaBancaria {

	private static double limite;
	
    public ContaEspecial(String nomeCliente, int numConta, double saldo, double limite) {
		super(nomeCliente, numConta, saldo);
		this.limite = limite;
	}
    
   public boolean sacar(double valor) {
		double saldoComLimite = this.getSaldo()+ limite;
		System.out.println("Saldo anterior "+saldo);
		if ((saldoComLimite - valor) >=0){
	    this.setSaldo(this.getSaldo()-valor);
	     System.out.println("Realizando um saque "+valor);
	     return true;	
		 }
		System.out.println("Não é possivel realizar o saque. ");
		return false;	
	}
	public static double sacarEspecial(double saque) {
		return saldo-=saque+limite;
		
	}
	
	 public static void realizarSaque(ContaBancaria conta, double valor){
   	  
	     	if (conta.sacar(valor)){
	     		 System.out.println("Saque efetuado com sucesso, novo saldo "
	   			   +conta.getSaldo());
	      } else {
	   	   System.out.println("Saldo insuficiente para o saque solicitadao " + valor + 
	   			   "; seu saldo é de = " +conta.getSaldo());
	      }	
	     }
	
	public String toString() {
		String info = " ContaEspecial [ ";
		info += "Nome do Cliente: " +nomeCliente;
		info += " ; numero da Conta : " +numConta;
		info += "; Saldo : " +saldo;
		info += " ]" ;
		
		return info;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
}