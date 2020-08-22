package com.lgcirilo.javacore.introducaometodos.sobrecargametodos.classes;

public class Funcionario{
    private String nome;
	private String cpf;
	private double salario;
	private String rg; // TODO - getter and setter

	// a sobrecarga de metodos acontece quando metodos de mesmo nome tem tipos e/ou quantidades
	// de parametros diferentes. O tipo de retorno do metodo nao imfluencia no polimorfismo.

	public Funcionario() {}

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

    public Funcionario(String nome, String cpf, double salario, String rg) {
		this(nome, cpf, salario); // chamando o contrutor ja criado para os tres primeros argumentos
		this.rg = rg;
	}

    public void setNome(String nome) {
        this.nome = nome;
	}

    public void setCpf(String cpf) {
        this.cpf = cpf;
	}

    public void setSalario(double salario) {
        this.salario = salario;
	}

    public void setRg(String rg) {
        this.rg = rg;
	}

	public String getNome() {
        return this.nome;
    }

	public String getCpf() {
        return this.cpf;
    }

	public double getSalario() {
        return this.salario;
    }

	public String getRg() {
        return this.rg;
    }

    @Override
	public String toString() {
        return this.nome + " " + this.cpf + " " + this.salario + " " + this.rg;
	}
}
