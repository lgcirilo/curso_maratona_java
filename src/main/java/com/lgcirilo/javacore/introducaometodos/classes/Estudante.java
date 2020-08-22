package com.lgcirilo.javacore.introducaometodos.classes;

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;

	public Estudante() {
	    this.notas = new double[3];
	}

	public Estudante(String nome, int idade, double nota1, double nota2, double nota3) {
        this.nome = nome;
		this.idade = idade;
	    this.notas = new double[3];
        this.notas[0] = nota1;		
        this.notas[1] = nota2;		
        this.notas[2] = nota3;		
	}

	public void setNome(String nome) {
        this.nome = nome;
	}

	public void setIdade(int idade) {
        this.idade = idade;
	}

	public void setNotas(double[] notas) {
        if (notas.length != 3) {
		    return;
		}
		this.notas[0] = notas[0];
		this.notas[1] = notas[1];
		this.notas[2] = notas[2];
	}

	public String getNome() {
        return this.nome;
	}

	public int getIdade() {
        return this.idade;
	}

	public double[] getNotas() {
        return this.notas;
	}

	public String media() {
        return "aluno: " + this.nome + ", " + this.idade + " anos. " + isAprovado();
	}

	public boolean isAprovado() {
		double total = 0;
        for(double nota: notas) {
            total = total + nota;
		}
		return (total / 3) >= 6;
	}
}
