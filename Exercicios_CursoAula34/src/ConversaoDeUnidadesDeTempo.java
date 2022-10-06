public class ConversaoDeUnidadesDeTempo {
			
    static double minuto = 60;
    static double hora;
    static double dia;
    static int semana;
    static int mes;
    static int ano;
    int numero;
    
   public static double converterMin(int numero) {
	   return numero/60;
   }
   public static double converterHora(int numero) {
	   return numero/60; 
   }
   public static double converterDia(int numero) {
	   return numero/24; 
   }
   public static double converterSemana(int numero) {
	   return numero/7; 
   }
   public static double converterMes(int numero) {
	   return numero/30; 
   }
   public static double converterAno(int numero) {
	   return 365.25/numero; 
   }  
}