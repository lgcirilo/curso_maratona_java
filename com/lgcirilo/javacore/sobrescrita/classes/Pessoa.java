package com.lgcirilo.javacore.sobrescrita.classes;

public class Pessoa {
    private String nome;
    private int idade;

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
    
    @Override
    public String toString() {
        return "nome: " + this.nome + " idade: " + this.idade;
    } 
} 
