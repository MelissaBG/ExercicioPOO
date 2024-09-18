package org.example;


public abstract class Funcionario implements Exibivel {
    private String nome;
    public double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public abstract double calcularBonus();


    public double calcularBonusComPercentual(double percentual) {
        return salario * percentual;
    }

    public double calcularBonusComPercentualEValorFixo(double percentual, double bonusAdicional) {
        return salario * percentual + bonusAdicional ;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Salario: " + getSalario());
        System.out.println("Bônus: " + calcularBonus());
    }
    public void exibirBonusCustomizado(String tipo, double valorBonus) {
        System.out.printf("Bônus customizado para ", tipo, valorBonus);
    }

}