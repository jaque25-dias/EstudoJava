public class Contato {
	
	private static int contador=0;
	
	private int id;
	private String nome;
	private String email;
	private String telefone;
	
	public Contato() {
		contador++;
		id = contador;
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		String s= "";
		s += " Id:" + id+ "\n";
		s += " Nome:" + nome+"\n";
		s += " Telefone:" + telefone+ "\n";
		s += " Email: " + email+"\n";
		s += "";
		return s;
	}
	
	
}
