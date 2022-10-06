
public abstract class Item {
 	
	private double preco; 
 	private String nomeItem;
 	
 	public Item(String nomeItem, double preco) {	
		this.nomeItem = nomeItem;
		this.preco = preco;
 	}

		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		public String getNomeItem() {
			return nomeItem;
		}
		public void setNomeItem(String nomeItem) {
			this.nomeItem = nomeItem;
		}

	}