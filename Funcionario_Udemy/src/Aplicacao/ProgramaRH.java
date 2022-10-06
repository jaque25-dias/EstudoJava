package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidade.Funcionario;

public class ProgramaRH {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();

		System.out.println("Digite a quantidade de Funcionário da empresa: ");
		int quantidade = leia.nextInt();

		for (int i = 0; i < quantidade; i++) {

			System.out.println();
			System.out.println("Funcionário # " + (i + 1) + " : ");
			System.out.print("Numero ID: ");
			Integer id = leia.nextInt();
			System.out.println();
		
			while (hasId(list, id)) {
				System.out.println("Este numero de ID já existe. Digite um novo ID!!");
				id= leia.nextInt();
			}

			System.out.println("Nome: ");
			String nome = leia.nextLine();
			leia.nextLine();
			System.out.print("Valor do salário R$: ");
			Double salario = leia.nextDouble();
		    System.out.println();
			
		    Funcionario funcionario = new Funcionario(id, nome, salario);
            
		    list.add(funcionario);
		    
		}
		
		System.out.println();
		System.out.println("Digite o ID do funcionario para receber " + "o aumento no salário");
		int idsalario = leia.nextInt();
		
		Integer pos = hasId (list, idsalario);
		
		if (pos == null) {
			System.out.println("Este ID não existe !!!");
		}
		else {
			 System.out.println("Entre com o valor da porcentagem : ");
	    	 int porcentagem= leia.nextInt();
	    	 list.get(pos).aumentoSalario(porcentagem);
	      }
		
			
		System.out.println();
		System.out.println("Lista dos funcionários : ");
		for (Funcionario funcionarioN: list) {
			System.out.println(funcionarioN);
		}
		  
		leia.close();
	}

	public static Integer hasId(List<Funcionario> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
//	public static boolean hasID(List<Funcionario> list, int id) {
//		Funcionario newDevolp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
//		return newDevolp != null;
		}