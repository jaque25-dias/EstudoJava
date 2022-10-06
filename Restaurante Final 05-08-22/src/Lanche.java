

public class Lanche extends Item {
	
		private int peso;
		private String ingrediente;
		
	public Lanche(String nomeItem, double preco,int peso,String ingrediente ) {
			super(nomeItem, preco); 
			this.peso = peso;
			this.ingrediente = ingrediente;
		}
		public int getPeso() {
			return peso;
		}
		public void setPeso(double peso) {
			this.peso = (int) peso;
		}
		public String getIngrediente() {
			return ingrediente;
		}
			
		public void setIngredientes(String ingrediente) {
				this.ingrediente = ingrediente;
				
			}
		public static void setNome(String nextLine) {
			// TODO Auto-generated method stub
			
		}

		}