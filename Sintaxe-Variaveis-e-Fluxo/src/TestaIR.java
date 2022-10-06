
public class TestaIR {
	 public static void main(String[] args) {
		    	
		    	//De 1900.0 até 2800.0, o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142
		    	//De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350
		    	//De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636

	                
		    	
	       double salario = 2885.0;
	       
	       if(salario > 1990.0 && salario <= 2800.0){ 
	             System.out.println("A sua aliquota é de 7.5% " );
	             System.out.println("Você pode deduzir até R$ 142 da declaração de IR");
	       }
	       
	       if(salario > 3751.0){
	             System.out.println("A sua aliquota é de 15%");
	             System.out.println("Você pode deduzir até R$ 350 da declaração de IR");
	                
	      } 
	       else if(salario > 4664.0){
		         System.out.println("A sua aliquota é de 22.5%");
		         System.out.println("Você pode deduzir até R$ 636 da declaração de IR");	            }    
	        }
	    }

