
public enum Operacao {
	
	SOMAR("+") {
		@Override
		public int executarOperacao(int A, int B) {
			// TODO Auto-generated method stub
			return A+B;
		}
	}, SUBTRAIR("-") {
		@Override
		public int executarOperacao(int A, int B) {
			// TODO Auto-generated method stub
			return A-B;
		}
	}, MULTIPLICAR("*") {
		@Override
		public int executarOperacao(int A, int B) {
			// TODO Auto-generated method stub
			return A*B;
		}
	}, DIVIDIR("/") {
		@Override
		public int executarOperacao(int A, int B) {
			// TODO Auto-generated method stub
			return A/B;
		}
	};	
	
	private String simbolo;
	
	Operacao(String simbolo) {
		this.simbolo = simbolo;
	}
	@Override
	
	public String toString() {
		return this.simbolo;
	}
	
	
	public abstract int executarOperacao(int A, int B);

}