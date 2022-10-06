package figuraGeometrica;

public class cubo extends figura3D{
 private int aresta;

public int getAresta() {
	return aresta;
}

public void setAresta(int aresta) {
	this.aresta = aresta;
}

@Override
public double calcularVolume() {
	return aresta*aresta*aresta;
}

@Override
public double calcularArea() {
	return 6* (aresta*aresta);
}
 
}
