
public class TrianguloEquilatero extends Triangulo implements FormaGeometrica{
	
	public TrianguloEquilatero(double lado) {
		super(lado, lado, lado);
		
	}

	public double area () {
		return (Math.sqrt(3) / 4) * (this.lado1);
	}
	
	public double perimetro() {
		return this.lado1 * 3;
	}

}
