
public class TestaEnumClass {

	public static void main(String[] args) {

    DiaSemanaE dia = DiaSemanaE.DOMINGO;
    
    System.out.println(dia.toString() + " referente a "+dia.getValor());
	
    System.out.println();
    DiaSemanaE[] dias = DiaSemanaE.values();
   
    for (int i=0; i<dias.length; i++) {
    	System.out.println(dias[i]);
    }
    Data data = new Data(25, 8, 2022, DiaSemanaE.QUINTA);
     
    		
}
}