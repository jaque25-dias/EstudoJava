
public class NotasAlunos {

	public static void main(String[] args) {
    
	double [] [] notasAlunos = new double [30] [4];
	
	
	notasAlunos [0] [0] = 5;
	notasAlunos [0] [1] = 7;
	notasAlunos [0] [2] = 10;
	notasAlunos [0] [3] = 6;

	notasAlunos [1] [0] = 10;
	notasAlunos [1] [1] = 7;
	notasAlunos [1] [2] = 9.5;
	notasAlunos [1] [3] = 9;

	notasAlunos [2] [0] = 8;
	notasAlunos [2] [1] = 9;
	notasAlunos [2] [2] = 10;
	notasAlunos [2] [3] = 6;
	
	notasAlunos [3] [0] = 10;
	notasAlunos [3] [1] = 8;
	notasAlunos [3] [2] = 8.5;
	notasAlunos [3] [3] = 6.8;


	System.out.println("A nota do alunos é :  "+notasAlunos[3][3]);
	}

}
