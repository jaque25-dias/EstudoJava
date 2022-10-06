
public class Urso extends Mamifero{

	public Urso() {
		super.setCor("castanho");
		super.setAlimento("Mel");
	}
@Override
	public String toString() {
	
	return super.toString()
			+ "alimento"+getAlimento();
			

	}
	
}