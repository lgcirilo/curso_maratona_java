package com.lgcirilo.javacore.polimorfismo.classes;

public class Vendedor extends Funcionario {
    private double totalVendas;

    public Vendedor() { }

    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    public Vendedor(String nome, double salario, double totalVendas) {
        this(nome, salario);
        this.totalVendas = totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return this.totalVendas;
    }

    @Override
    public void calcularPagamento() {
        this.salario = this.salario + (this.totalVendas * 0.05);
    }
}

