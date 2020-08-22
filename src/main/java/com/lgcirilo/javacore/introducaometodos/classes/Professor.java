package com.lgcirilo.javacore.introducaometodos.classes;

import java.lang.StringBuilder;

public class Professor {
	private String nome;
	private String matricula;
	private String rg;
	private String cpf;

    public String getNome() {
		return this.nome;
	}

    public String getMatricula() {
		return this.matricula;
	}

    public String getRg() {
		return this.rg;
	}

    public String getCpf() {
		return this.cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

/*	
    public void imprime(Professor prof) {
        StringBuilder sb = new StringBuilder();
		sb.append("nome: ");
		sb.append(nome);
		sb.append(" matricula: ");
		sb.append(matricula);
		sb.append(" rg: ");
		sb.append(rg);
		sb.append(" cpf: ");
		sb.append(cpf);
		System.out.println(sb.toString());
	}	
*/
    public void imprime() {
        StringBuilder sb = new StringBuilder();
		sb.append("nome: ");
		sb.append(this.nome);
		sb.append(" matricula: ");
		sb.append(this.matricula);
		sb.append(" rg: ");
		sb.append(this.rg);
		sb.append(" cpf: ");
		sb.append(this.cpf);
		System.out.println(sb.toString());
	}	
}
