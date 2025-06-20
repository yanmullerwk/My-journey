package com.crescer.yan.pessoa;


public class Funcionario extends Pessoa {
    public static double PERCENTUAL_PADRAO_BONUS = 10;
    public static int CARGA_HORARIA_PADRAO = 220;

    private static final double CEM = 100;

    private String matricula;
    private double cargaHoraria;

    public Funcionario(String nome, String cpf, String rg, String matricula) {
        super(nome, cpf, rg);
        this.cargaHoraria = CARGA_HORARIA_PADRAO;
        this.matricula = matricula;
    }

    public double getSalarioComBonus() {
        return this.salario + ((this.salario*PERCENTUAL_PADRAO_BONUS)/CEM);
    }
}
