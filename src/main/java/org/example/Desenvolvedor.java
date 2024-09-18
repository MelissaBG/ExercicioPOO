package org.example;


public class Desenvolvedor extends Funcionario {

    private static final double PERCENTUAL_BONUS = 0.10;

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return calcularBonusComPercentual(PERCENTUAL_BONUS);
    }
}
