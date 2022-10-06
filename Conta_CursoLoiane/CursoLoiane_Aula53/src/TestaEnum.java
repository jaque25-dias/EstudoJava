
public class TestaEnum {

	public static void main(String[] args) {

		usandoConstantes();
		System.out.println("Escolha um dia da semana");
		usandoEnum();
	}
		
	private static void usandoConstantes() {

		int segunda = DiasDaSemanaConstante.SEGUNDA;
		int terca = DiasDaSemanaConstante.TERCA;
		int quarta = DiasDaSemanaConstante.QUARTA;
		int quinta = DiasDaSemanaConstante.QUINTA;
		int sexta = DiasDaSemanaConstante.SEXTA;
		int sabado = DiasDaSemanaConstante.SABADO;
		int domingo = DiasDaSemanaConstante.DOMINGO;
		
		System.out.println("Teste utilizando no Java ");
		imprimeDiaDaSemana(segunda);
		imprimeDiaDaSemana(terca);
		imprimeDiaDaSemana(quarta);
		imprimeDiaDaSemana(quinta);
		imprimeDiaDaSemana(sexta);
		imprimeDiaDaSemana(sabado);
		imprimeDiaDaSemana(domingo);

	}

	private static void imprimeDiaDaSemana(int dia) {
		
		switch (dia) {
		case 1:
			System.out.println("Você escolheu Segunda-feira ");
			break;
		case 2:
			System.out.println("Você escolheu Terça-feira ");
			break;
		case 3:
			System.out.println("Você escolheu Quarta-feira ");
			break;
		case 4:
			System.out.println("Você escolheu Quinta-feira ");
			break;
		case 5 :
			System.out.println("Você escolheu Sexta-feira ");
			break;
		case 6:
			System.out.println("Você escolheu Sabado");
			break;
		case 7:
			System.out.println("Você escolheu Domingo");
			break;
		}
		}
	
		private static void usandoEnum() {

			DiaSemana segunda = DiaSemana.SEGUNDA;
			DiaSemana terca = DiaSemana.TERCA;
			DiaSemana quarta = DiaSemana.QUARTA;
			DiaSemana quinta = DiaSemana.QUINTA;
			DiaSemana sexta = DiaSemana.SEXTA;
			DiaSemana sabado = DiaSemana.SABADO;
			DiaSemana domingo = DiaSemana.SABADO;
			
			System.out.println("Testando enum no Java");
		}
		}

