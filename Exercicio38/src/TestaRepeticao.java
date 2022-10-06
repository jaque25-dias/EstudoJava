
public class TestaRepeticao {
	public static void main(String[] args) {
		
	
	int total = 0; 
	  
	  while(total > 20) {
	    System.out.printf( "Total = %d\n", total );
	    
	    System.out.printf( "Entre com um numero: " );
	
	    total += total;
	  }
	  
	  System.out.printf( "Final total = %d\n", total );
	}
}
