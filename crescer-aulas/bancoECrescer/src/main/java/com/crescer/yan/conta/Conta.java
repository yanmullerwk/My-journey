package com.crescer.yan.conta;

import com.crescer.yan.pessoa.Pessoa;

public class Conta {
    private Pessoa titular;
    private int numero;
    private double saldo;

    public Conta(Pessoa titular, int numero) {
        this.numero = numero;
        this.titular = titular;
    }

    public Conta(Pessoa titular, int numero, double saldoInicial) {
        this.titular = titular;
        this.numero = numero;
        this.deposita(saldoInicial);
    }

    public boolean sacar(double valorSaque){
        if(this.saldo >= valorSaque){
            this.saldo -= valorSaque;
            return true;
        }
        return false;
    }

    public void deposita(double valorDeposito){ this.saldo += valorDeposito; }

    public boolean transferir(Conta contaDestino, double valorTransferencia){
        boolean foiPossivelSacar = this.sacar(valorTransferencia);
        if(foiPossivelSacar){
            contaDestino.deposita(valorTransferencia);
            return true;
        }
        return false;
    }

    public int getNumero() {return numero;}
    public double getSaldo() {return saldo;}

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }
}
