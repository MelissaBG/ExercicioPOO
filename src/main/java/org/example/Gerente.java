package org.example;

public class Gerente extends Funcionario {

    private static final double PERCENTUAL_BONUS = 0.20;
    private static final double BONUS_ADICIONAL = 400.0;

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return calcularBonusComPercentual(PERCENTUAL_BONUS);
    }

    public void exibirBonusCustomizado() {
        double bonusComFixo = calcularBonusComPercentualEValorFixo(PERCENTUAL_BONUS, BONUS_ADICIONAL);
        double bonusSemFixo = calcularBonusComPercentual(PERCENTUAL_BONUS);

        System.out.printf("Bônus customizado para Gerente (com valor fixo): %.2f\n", bonusComFixo);
        System.out.printf("Bônus customizado para Gerente (sem valor fixo): %.2f\n", bonusSemFixo);
    }
}


