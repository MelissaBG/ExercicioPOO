package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        Funcionario gerente = new Gerente("Carlos", 2000);
        Funcionario desenvolvedor = new Desenvolvedor("Ana", 1000);

        gerente.exibirInformacoes();
        desenvolvedor.exibirInformacoes();

        System.out.print("Insira o percentual de bônus para o gerente (ex: 0.20 para 20%): ");
        double percentualGerente


/*        System.out.println("Insira o valor fixo de bônus adicional para o gerente: " +
                gerente.calcularBonusComPercentualEValorFixo(0.20, 400));
        System.out.println("Bônus customizado para Gerente (sem valor fixo): " +
                gerente.calcularBonusComPercentual(0.20));

        System.out.println("Bônus customizado para Desenvolvedor (com valor fixo): " +
                desenvolvedor.calcularBonusComPercentualEValorFixo(0.10, 300));
        System.out.println("Bônus customizado para Desenvolvedor (sem valor fixo): " +
                desenvolvedor.calcularBonusComPercentual(0.10));
*/    }
}
