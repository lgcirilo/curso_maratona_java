package com.lgcirilo.javacore.classesabstratas.classes;

// classes abstratas nao podem ser instanciadas
// classes abstratas podem estender outras classes abstratas
// classes abstratas podem ter metodos concretos e metodos abstratos
public abstract class Funcionario extends Pessoa {
    protected String clt;
    protected double salario;

    public Funcionario() { }

    public Funcionario(String nome, String clt, double salario) {
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
    }

    // metodos abstratos devem ser obrigatoriamente sobrescritos nas classes filhas
    public abstract void calculaSalario();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public String getClt() {
        return this.clt;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    @Override 
    public String toString() {
        return "Funcionario{nome=" + this.nome +
               ", clt=" + this.clt +
               ", salario=" + this.salario +
               '}';
    }
}
