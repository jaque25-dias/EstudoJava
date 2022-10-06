package figuraGeometrica;

public class TesteFiguras {

	public static void main(String[] args) {

    quadrado q1 = new quadrado();
    q1.setLado(10);
    q1.setNome("DADO");
    q1.setCor("Preto");
   
		
	triangulo t1 = new triangulo();
	t1.setNome("Pingente");
	t1.setCor("amarelo");
	t1.setAltura(20);
	t1.setBase(20);
	t1.calcularArea();
	
	circulo c1= new circulo();
	c1.setCor("AZUL");
	c1.setNome("BOLA");
	c1.setRaio(20);
	
	
	piramide p1= new piramide();
	p1.setNome("Amuleto");
	p1.setCor("vermelho");
	p1.setAltura(5);
	p1.setApotema(7);
	p1.setArestaBase(2);
	p1.setNumPolibase(5);
	p1.setBase(q1);
	
    figuraGeometricaJava[] figuras = new figuraGeometricaJava[4];
    figuras[0]= q1;
    figuras[1]= t1;
    figuras[2]= c1;
    figuras[3]= p1;
    
    for (figuraGeometricaJava figura: figuras) {
//    	System.out.println("--------------------");
    	System.out.println("---------Formas geometricas-----------");
    	System.out.println(figura.getNome());
    	
    	if(figura instanceof figura2D) {
    		figura2D f2d = (figura2D) figura;
    		System.out.println(f2d.calcularArea());
    	}
    	if(figura instanceof figura3D) {
    		figura3D f3d = (figura3D) figura;
    		System.out.println(f3d.calcularArea());
    		System.out.println(f3d.calcularVolume());
    	}
    	
    }
    
    
		
	}

}
