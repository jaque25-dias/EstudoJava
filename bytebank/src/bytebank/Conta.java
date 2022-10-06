package bytebank;

public class Conta {
	double saldo;
    int agencia;
    int numero;
    String titular;

    // this = isto (Para mostrar esse valor desta conta) pois o valor não é um atributo sim um metodo criado para armazenar o valor
    public void deposita(double valor) {
    this.saldo+=valor; 
	}
	
	// bollean para indicar se o valor verdadeiro ou falso (retornar a mensagem abaixo)
    public boolean saca(double valor) { 
        if(this.saldo >= valor) {
            this.saldo -= valor;
          return true;
        } else 
          { 
            return false; 
                  }
    }
             // atributos destino (funciona somente dentro desse boolean)
            // métodos transfere
           // Classe Conta (C maiusculo)
		
      public boolean transfere(double valor, Conta destino){
         if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);    
            return true;
      }
             return false;
      }
            }