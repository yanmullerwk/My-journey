package com.crescer.yan.pessoa;

public class Vendedor extends Funcionario {
    private int quantDeVendas;


    public Vendedor(String nome, String cpf, String rg, String matricula, int quantDeVendas) {
        super(nome, cpf, rg, matricula);
        this.quantDeVendas = quantDeVendas;

    }
}
