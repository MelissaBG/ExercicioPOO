package org.example;

public class Gerente extends Funcionario {

    private static final double PERCENTUAL_BONUS = 0.20;

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return calcularBonusComPercentual(PERCENTUAL_BONUS);
    }
}


