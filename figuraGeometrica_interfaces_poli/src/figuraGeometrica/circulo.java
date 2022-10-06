package figuraGeometrica;

public class circulo extends figura2D {
 private double raio;

public double getRaio() {
	return raio;
}
public void setRaio(double raio) {
	this.raio = raio;
}
@Override
public double calcularArea() {
	
	return (raio*raio)*3.14;
}
@Override
	public String toString() {
		return super.toString()+"\n" +getCor()+"\n"+getNome()+"\n"+getRaio();
	}
 
}
