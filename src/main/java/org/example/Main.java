package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Funcionario gerente = new Gerente("Carlos", 2000);
        Funcionario desenvolvedor = new Desenvolvedor("Ana", 1000);

        gerente.exibirInformacoes();
        ((Gerente) gerente).exibirBonusCustomizado();

        desenvolvedor.exibirInformacoes();
        ((Desenvolvedor) desenvolvedor).exibirBonusCustomizado();
    }
}
