package aplicacao;

import java.util.Scanner;

import Entidade.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
	
	
		
		System.out.println("Entre com data do produto");
		System.out.println("Nome: ");
		String nome = leia.nextLine();
		
		System.out.println("Entre com o preço produto");
		System.out.println("Preco: ");
		Double preco = leia.nextDouble();
		
		System.out.println("Entre com a quantidade do produto");
		System.out.println("Quantidade no estoque: ");
		int quantidade= leia.nextInt();
		
		Produto produto = new Produto(nome, preco, quantidade);
		
		System.out.println(produto.toString());
		
		
		System.out.println();
		System.out.println("Entre com uma quantidade para adicionar no estoque: ");
		int novaQuantidade= leia.nextInt();
		produto.addProduto(novaQuantidade);
		
		System.out.println();
		System.out.println("Dados do Estoque " + produto);
		
		System.out.println();
		System.out.println("Entre com uma quantidade para remover no estoque: ");
		int removaQuantidade= leia.nextInt();
		produto.removerEstoque(removaQuantidade);
		
		System.out.println();
		System.out.println("Dados do estoque "+produto);
		
		leia.close();
	
	}
	
	
	
}
