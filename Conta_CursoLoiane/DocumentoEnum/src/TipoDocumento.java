
public enum TipoDocumento {

	CPF {
		@Override
		public String geraNumeroTeste() {
			
			return GeraCpfCnpj.main(Cpf);;
		}
		}
	}, CNPJ {
        public String geraNumeroTeste() {
			
			return GeraCpfCnpj.main(Cnpj);
		}
	};
	
 public abstract String geraNumeroTeste();
 
 }
}