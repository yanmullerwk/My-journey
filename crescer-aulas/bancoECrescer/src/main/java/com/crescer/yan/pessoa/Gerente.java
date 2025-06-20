package com.crescer.yan.pessoa;

public class Gerente extends Funcionario {
    private boolean gerenteRegional;

    public Gerente(String nome, String cpf, String rg, String matricula) {
        super(nome, cpf, rg, matricula);
    }
    public Gerente(String nome, String cpf, String rg, String matricula, boolean gerenteRegional) {
        super(nome, cpf, rg, matricula);
        this.gerenteRegional = gerenteRegional;
    }
    public boolean isGerenteRegional() {
        return gerenteRegional;
    }

    public void setGerenteRegional(boolean gerenteRegional) {
        this.gerenteRegional = gerenteRegional;
    }
}
