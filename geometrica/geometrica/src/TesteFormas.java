
public class TesteFormas {

	public static void main(String[] args) {
		
	//	FormaGeometrica forma = new Quadrado(5);
	//	FormaGeometrica forma = new Circulo(5);
		FormaGeometrica forma = new TrianguloEquilatero(5);
		
		System.out.println("A área é: " + forma.area());
		System.out.println("O comprimento é: " + forma.perimetro());
	}
}
