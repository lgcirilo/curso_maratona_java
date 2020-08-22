package com.lgcirilo.javacore.associacao.classes;


public class Aluno {
    private String nome;
	private int idade;
	private Seminario seminario;

	public Aluno() { }

	public Aluno(String nome, int idade) { 
        this.nome = nome;
		this.idade = idade;
	}

	@Override
	public String toString() {
	    if(seminario != null) {
            return "nome: " + this.nome + " idade: " + this.idade; 
		}
		return "nome: " + this.nome + " idade: " + this.idade; 
	}

	public void setNome(String nome) { 
        this.nome = nome;
	} 

	public String getNome() {
        return this.nome;
	}

	public void setIdade(int idade) { 
        this.idade = idade;
	} 

	public int getIdade() {
        return this.idade;
	}

	public void setSeminario(Seminario seminario) { 
        this.seminario = seminario;
	} 

	public Seminario getSeminario () {
        return this.seminario;
	}
} 

