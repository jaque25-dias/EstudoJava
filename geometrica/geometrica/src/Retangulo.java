
public class Retangulo implements FormaGeometrica {
	
	double base, altura;
	
	public double area() {
		return base * altura;
		
	}

	public double perimetro() {
		return 2 * (base + altura);
		
	}
}
