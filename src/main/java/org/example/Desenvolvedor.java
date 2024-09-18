package org.example;


public class Desenvolvedor extends Funcionario {

    private static final double PERCENTUAL_BONUS = 0.10;
    private static final double BONUS_ADICIONAL = 300.0;

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return calcularBonusComPercentual(PERCENTUAL_BONUS);
    }

    public void exibirBonusCustomizado() {
        double bonusComFixo = calcularBonusComPercentualEValorFixo(PERCENTUAL_BONUS, BONUS_ADICIONAL);
        double bonusSemFixo = calcularBonusComPercentual(PERCENTUAL_BONUS);

        System.out.printf("Bônus customizado para Desenvolvedor (com valor fixo): %.2f\n", bonusComFixo);
        System.out.printf("Bônus customizado para Desenvolvedor (sem valor fixo): %.2f\n", bonusSemFixo);
    }
}
