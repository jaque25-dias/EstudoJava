
public class TestaContador {

    static void imprimirValor() {
		System.out.println(Contador01.retornaValor());
	}
 
	public static void main(String[] args) {
    
	Contador01.incrementa();
    

	imprimirValor();
    
	Contador01.zerar();
    
	imprimirValor();
    
	Contador01.retornaValor();
    
	imprimirValor();
    
		
		
	}
}