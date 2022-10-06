
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario Jaqueline = new Funcionario();
		Jaqueline.setNome("Jaqueline Dias");
		Jaqueline.setCPF("095.999.977.72");
		Jaqueline.setSalario(1234);

		System.out.println(Jaqueline.getNome());
		System.out.println(Jaqueline.getCPF());
		System.out.println(Jaqueline.getSalario());

	}
}