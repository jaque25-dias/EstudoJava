import java.util.Scanner;

public class TestaCalculaMedia {
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de media de alunos!");
        System.out.println("Digite o Nome do Aluno: ");
        
        String nome = scanner.nextLine();
        System.out.println("Qual o tipo do aluno? (1 = Normal, 2 = Especial," + " 3 = Exatas, 4 = Humanas)");
        Integer resposta = scanner.nextInt();
       
            // Aqui determina que será determinado aluno aquele que é menor que 5 pois tem 4
            // tipos
            // e o quinto é aluno normal
            if (resposta <= 5) {
                Alunos aluno;

                switch (resposta) {
                case 1:
                    aluno = new Alunos(nome);
                    break;
                case 2:
                    aluno = new AlunoEspecial(nome);
                    break;
                case 3:
                    aluno = new AlunoDeExatas(nome);
                    break;
                case 4:
                    aluno = new AlunoDeHumanas(nome);
                    break;

                default:
                    aluno = new Alunos(nome);
                    break;
                }

                aluno.perguntaNotas();
                aluno.calculaMedia();

                System.out.print(" A situação do aluno : " + aluno.getNome());
                System.out.print(" foi " + aluno.pegaSituacao());
            } else {
                System.out.println(" Tipo do aluno inválido!");
            }
        }
        }