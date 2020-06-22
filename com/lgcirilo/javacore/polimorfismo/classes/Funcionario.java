package com.lgcirilo.javacore.polimorfismo.classes;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario() { }

    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void setNome(String nome){ 
        this.nome = nome;
    } 

    public String getNome() {
        return this.nome;
    }

    public void setSalario(double salario){ 
        this.salario = salario;
    } 

    public double getSalario() {
        return this.salario;
    }

    public abstract void calcularPagamento();

    @Override
    public String toString() {
        return "Funcionario{nome=" + this.nome +
               ", salario=" + this.salario +
               '{';
    }
}
