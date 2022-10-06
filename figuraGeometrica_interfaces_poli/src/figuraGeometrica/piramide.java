package figuraGeometrica;

public class piramide extends figura3D {
private int altura;
private int arestaBase;
private int apotema;
private int numPolibase;



public int getNumPolibase() {
	return numPolibase;
}

public void setNumPolibase(int numPolibase) {
	this.numPolibase = numPolibase;
}


private figura2D base;

public int getAltura() {
	return altura;
}

public void setAltura(int altura) {
	this.altura = altura;
}

public int getArestaBase() {
	return arestaBase;
}

public void setArestaBase(int arestaBase) {
	this.arestaBase = arestaBase;
}

public int getApotema() {
	return apotema;
}

public void setApotema(int apotema) {
	this.apotema = apotema;
}

public figura2D getBase() {
	return base;
}

public void setBase(figura2D base) {
	this.base = base;
}

@Override
public double calcularVolume() {
	if(base!= null) {
	return (base.calcularArea()*altura)/3;
}
	return 0;
}

@Override
public double calcularArea() {
	if(base!= null) { 
	return (numPolibase *((arestaBase*apotema)/2))
			+base.calcularArea();
}
return 0;
}
}