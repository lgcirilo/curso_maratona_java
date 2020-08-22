package com.lgcirilo.javacore.associacao.classes;

import java.util.ArrayList;
import java.lang.StringBuilder;

public class Professor {
    private String nome;
	private String especialidade;
	private ArrayList<Seminario> seminarios;

	public Professor() { } 

	public Professor(String nome, String especialidade) {
        this.nome = nome;
		this.especialidade = especialidade;
	} 

    @Override
	public String toString() {
        return "nome: " + nome + " especialidade " + this.especialidade;
	}

	public void setNome(String nome) {
        this.nome = nome;
	}

    public String getNome() {
        return this.nome;
	}

	public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
	}

    public String getEspecialidade() {
        return this.especialidade;
	}

	public void setSeminarios(ArrayList<Seminario> seminarios) {
        this.seminarios = seminarios;
	}

    public ArrayList<Seminario> getSeminarios() {
        return this.seminarios;
	}
} 

