public class AlunoEspecial extends Alunos {
	
	    public AlunoEspecial(String nome) {
	      super(nome);
	    }
	     
	    public String pegaSituacao() {
	        if (this.media >= 7) {
	            return "APROVADO";
	        }
	        return "EM ANALISE PELO CORPO DOCENTE";
	    }
}