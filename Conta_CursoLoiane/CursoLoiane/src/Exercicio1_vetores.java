
public class Exercicio1_vetores {

 public static void main(String[] args) {
	
	 double tempDia001 = 31.4;
	 double tempDia002 = 32.2;
	 double tempDia003 = 25.4;
	 double tempDia004 = 35;
	 double tempDia005 = 30.4;
	 double tempDia006 = 32.5;
	 
	 double [] temperaturas = new double [365];
	 temperaturas[0] = 31.4;
	 temperaturas[1] = 32.2;
	 temperaturas[2] = 25.4;
	 temperaturas[3] = 35;
	 temperaturas[4] = 30.4;
	 temperaturas[5] = 32.5;
	 
	 System.out.println("O valor da temperatura do dia 01 é : " + temperaturas[0]);
	 
	 System.out.println("Valors do Array : " +temperaturas.length);
	 
	 for(int i=0; i<temperaturas.length; i++) {
		 System.out.println("O valor da temperatura do dia  " + (i+1)+ "é :" +temperaturas[i]);
	 }
	 
 }	
}
