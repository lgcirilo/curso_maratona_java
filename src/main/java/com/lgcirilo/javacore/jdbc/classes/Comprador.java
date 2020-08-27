package com.lgcirilo.javacore.jdbc.classes;

public class Comprador {
    Integer id;
    String cpf;
    String nome;

    public Comprador() {

    }

    public Comprador(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public Comprador(Integer id, String cpf, String nome) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comprador comprador = (Comprador) o;

        return id.equals(comprador.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
