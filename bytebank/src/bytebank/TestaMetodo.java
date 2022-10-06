package bytebank;

public class TestaMetodo {
	  public static void main(String[] args) {
		  //depositar
			  Conta contaDeJack = new Conta();
			  contaDeJack.saldo = 100;
			  contaDeJack.deposita(50);
		  //sacar
			  System.out.println(contaDeJack.saldo);
			  contaDeJack.saca(20);
		      System.out.println(contaDeJack.saldo);
		        {
		        boolean conseguiuRetirar = contaDeJack.saca(20);
		        System.out.println(contaDeJack.saldo);
		        System.out.println(conseguiuRetirar);
		  		  }
         //Transferir
		         Conta contaDaMarcela = new Conta();
		         contaDaMarcela.deposita(1000);
                 contaDaMarcela.transfere(200, contaDeJack);
		         System.out.println(contaDaMarcela.saldo);
		 //condições para transação da tranferencia (v ou F)
	             if(contaDaMarcela.transfere(200, contaDeJack)) {
                 System.out.println("transferencia realizada com sucesso!!");
                 } else {
                 System.out.println("Faltou saldo positivo na conta. Refaça a transação!!");
                 }
                 
                 System.out.println("saldo da Marcela " + contaDaMarcela.saldo);
                 System.out.println("saldo da Jack " +contaDeJack.saldo);
                  }
	  
}