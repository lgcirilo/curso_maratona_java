package com.lgcirilo.javacore.polimorfismo.classes;

public class Gerente extends Funcionario {
    private double pnl;

    public Gerente() { } 

    public Gerente(String nome, double salario, double pnl) { 
        super(nome, salario);
        this.pnl = pnl;
    } 

    public void serPnl(double pnl) {
        this.pnl = pnl;
    }

    public double getPnl() {
        return this.pnl;
    }

    @Override
    public void calcularPagamento() {
        this.salario =  this.salario + this.pnl;
    }
}

