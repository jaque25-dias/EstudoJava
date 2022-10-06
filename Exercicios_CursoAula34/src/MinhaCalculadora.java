
public class MinhaCalculadora {

	private int valor;
	
	public MinhaCalculadora() {
		
	}
	
	public void setValor(int valor) {
		this.valor=valor;
	}
    public int getValor() {
    	return this.valor;
    }
	
	
	public static int soma (int n1, int n2) {
		return n1 + n2;
		
	}
	public static int subtrair (int n1, int n2) {
    	return n1 - n2;
	}
	public static int multiplicar (int n1, int n2) {
	return n1 * n2;
	}
	public static int dividir(int n1, int n2) {
	return n1 / n2;
	}
	public static int zerar (int n1, int n2) {
	return n1-- + n2--;
	}
	public static void imprimeValor () {
	}
    static int calcularPotencia(int n1, int n2){
            int result = 1;
            if(n1 > 0 && n2==0){
                return result;
            }
            else if(n1 == 0 && n2>=1){
                return 0;
            }
            else{
                for(int i = 1; i<= n2; i++){
                	result = result*n1;
                }
                return result;
            }
    }	
}