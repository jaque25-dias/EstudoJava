import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
	 
	private int diaRendimento;
	private int numConta=002;
	 
	 //recebe taxa de rendimento da poupaça e calcula um novo saldo
	public ContaPoupanca(String nomeCliente, int numConta, double saldo, int diaRendimento) {
		super(nomeCliente, numConta, saldo);
		this.diaRendimento = diaRendimento;
	}
	
	 public boolean calcularNovoSaldo(double taxaRendimento){
		 Calendar hoje = Calendar.getInstance();
		 
		 if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			 saldo += saldo *taxaRendimento;
			 this.setSaldo(this.getSaldo() + (this.getSaldo()*taxaRendimento));
			 return true ;
		 } 
		 return false;
	 }
	 
	 @Override
	public String toString() {
				String info = " ContaPoupança[ ";
				info += "Nome do Cliente: " +nomeCliente;
				info += " ; numero da Conta : " +numConta;
				info += "; Saldo : " +saldo;
				info += "] " ;
				
				return info;
			}
	  
	 public ContaPoupanca() {
		 
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


	public int getDiaRendimento() {
		return diaRendimento;
	}


	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
}
