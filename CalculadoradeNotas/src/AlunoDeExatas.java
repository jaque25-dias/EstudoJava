import java.util.Scanner;

public class AlunoDeExatas extends Alunos {

    protected double nota3 = 0;

    public AlunoDeExatas(String nome) {
        super(nome);
    }

    public void perguntaNotas() {
        super.perguntaNotas();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a terceira Nota: ");
        this.nota3 = scanner.nextDouble();
    }

    public void calculaMedia() {
        super.media = (super.nota1 + super.nota2 + this.nota3) / 3;
    }
}