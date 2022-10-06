public class TestaGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setCPF("235568413");
		g1.setSalario(5000);

		System.out.println(g1.getNome());
		System.out.println(g1.getCPF());
		System.out.println(g1.getSalario());

		boolean autenticou = g1.autentica(1111);

		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
		
	
	}
}

//public - pode ser acessado, lido, mesmo fora da classe
//private - nem acessado, nem lido, exceto na própria Classe
//static - atributo da Classe, não do objeto, ou instancia 
//(exemplo: Conta.total++, a cada criação de uma instancia, adicione um a Conta.total)
//protected - public para os filhos, private para o restante