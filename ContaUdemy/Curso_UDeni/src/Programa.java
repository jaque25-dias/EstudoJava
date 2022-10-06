import java.util.Scanner;

import Entidades.Triangulo;

public class Programa {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		Triangulo x,y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Entre com as medidas do triangulo X: ");
		x.a = leia.nextDouble();
		x.b =  leia.nextDouble(); 
		x.c=  leia.nextDouble();
	
		System.out.println("Entre com as medidas do triangulo Y: ");
		y.a = leia.nextDouble();
		y.b =  leia.nextDouble(); 
		y.c=  leia.nextDouble();

       double p = (x.a + x.b+ x.c)/2.0;
       double areaX = Math.sqrt(p* (p-x.a) * (p-x.b) *(p-x.c));
          
       p = (y.a + y.b+ y.c)/2.0;
       double areaY= Math.sqrt(p* (p-y.a) * (p-y.b) *(p-y.c));
       
       System.out.printf("Tringulo X area : %.4f%n", areaX);
       System.out.printf("Tringulo X area : %.4f%n", areaY);
             
       if (areaX > areaY)
       {
       System.out.println("A area X é maior ");
       } else {
       System.out.println("A area Y é maior ");
       }
     leia.close();  
	}
}