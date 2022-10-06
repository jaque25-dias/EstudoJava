package figuraGeometrica;

public class cilindro extends figura3D {
 private int altura;
 private int raio;
public int getAltura() {
	return altura;
}
public void setAltura(int altura) {
	this.altura = altura;
}
public int getRaio() {
	return raio;
}
public void setRaio(int raio) {
	this.raio = raio;
}
@Override
public double calcularVolume() {

return 3.14*(raio*raio)*altura;
	
}
@Override
public double calcularArea() {
	double areaBase=3.14*(raio*raio);
	double areaLateral=2*3.14*raio*altura;
	double areaTotal= (2*areaBase)+areaLateral;
	return 0;
}


 
}
