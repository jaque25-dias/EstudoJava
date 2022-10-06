//33) Escreva um programa para aprovar ou não
// o empréstimo bancário para a compra de uma casa.
// O programa vai perguntar o valor da casa, o salário
// do comprador e em quantos anos ele vai pagar. 
//Calcule o valor da prestação mensal, sabendo que
// ela não pode exceder 30% do salário ou então o empréstimo será negado.

import java.util.Scanner;

public class EmprestimoBancario {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double valorImovel = 0;
        double salario = 0;
        int anos = 0;
        
        System.out.println("~~~~~~~~~~Simulador de Financiamento de imóvel~~~~~~~~~~");
        System.out.println("Qual o valor do imóvel ?");
        valorImovel = leia.nextDouble();

        System.out.println("Qual sua renda mensal?");
        salario = leia.nextDouble();

        
        System.out.println("Em quantos anos você irá quitar");
        anos = leia.nextInt();

        leia.close();
                
        double calculo = salario*0.3;
        double tempo = anos * 12;
        double parcelaMensal = (valorImovel / tempo);
        
        if ((parcelaMensal <= calculo)) {
            System.out.println("A prestação do seu imóvel financiado em " 
        + anos + " anos. Será de R$ " + String.format("%.2f", parcelaMensal));

        } else {
            System.out.println("O valor da parcela seria de R$" + String.format("%.2f", parcelaMensal)
                    + " . Você não pode financiar este imóvel pois excede 30% da sua renda mensal");
        }
    }

}