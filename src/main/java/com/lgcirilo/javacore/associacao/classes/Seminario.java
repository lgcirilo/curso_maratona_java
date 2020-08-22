package com.lgcirilo.javacore.associacao.classes;

import java.util.ArrayList;
import java.util.List;
import java.lang.StringBuilder;

public class Seminario {
    private String titulo;
	private Professor professor;
    private ArrayList<Aluno> alunos;
    private Local local;

	public Seminario() { }

	public Seminario(String titulo) { 
        this.titulo = titulo;
	}

    @Override
	public String toString() {
	    if (alunos != null && professor != null) {
            StringBuilder sb = new StringBuilder();
            for(Aluno aluno: this.alunos) {
                sb.append(aluno.toString());
                sb.append(" ");
            }
        return "titulo: " + this.titulo + " professor: " + this.professor.toString() + " local: " + this.local.toString() + " alunos: " + sb.toString();
		}
         
        return "titulo: " + this.titulo; 
	} 

    public void setTitulo(String titulo) {
        this.titulo = titulo;
	}

	public String getTitulo() {
        return this.titulo;
	}

    public void setProfessor(Professor professor) {
        this.professor = professor;
	}

	public Professor getProfessor() {
        return this.professor;
	}

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
	}

	public ArrayList<Aluno> getAlunos() {
        return this.alunos;
	}

    public void setLocal(Local local) {
        this.local = local;
	}

	public Local getLocal() {
        return this.local;
	}
}

