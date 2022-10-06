public class Pessoa {
    string nome;
    double massa;
    double altura;
  	double imc;
  	  	
  	public string getNome() {
		return nome;
	}
	public double getMassa() {
		return massa;
	}
	public double getAltura() {
		return altura;
	}
	public double getImc() {
		return imc;
	}
	public Pessoa (string nome; double massa; double altura; double imc;) {

  	public void calculaimc() {
  		this.imc = this.massa / (this.altura*this.altura)
   	}
  	
  	public string Avaliacaoimc() {
  	
  	if (this.imc < 17) {
  	  	 return "MUITO ABAIXO DO PESO";
  	}
   if (this.imc < 18.5) {
    return "Muito abaixo do peso ideal.";
  
  if (this.imc < 25) {
 	  	 return "MUITO ABAIXO DO PESO";
 	}
  if (this.imc < 30) {
	  	 return "MUITO ABAIXO DO PESO";
	}
  if (this.imc < 35) {
	  	 return "MUITO ABAIXO DO PESO";
	}
  if (this.imc < 40) {
	  	 return "MUITO ABAIXO DO PESO";
	}
 
	  	 return "Obesidade Mordida";
	}
  
	}
 
	
}
