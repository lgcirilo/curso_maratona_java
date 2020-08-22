package com.lgcirilo.javacore.introducaoclasses.classes;

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


}
