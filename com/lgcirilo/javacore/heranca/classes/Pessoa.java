package com.lgcirilo.javacore.heranca.classes;

public class Pessoa {
    // modificador protected faz com que o atribut possa ser acessado diretamente por por
    // classes filhas ou classes que estejam no mesmo pacote.
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    // Se nenhum construtor for declarado o construtor padrao existe implicitamente
    // Se qualquer outro construtor for declarado e for necessario o construtor padrao, a
    // declaracao explicita eh obrigatoria
    public Pessoa() {}

    // Se o construtor padrao nao for declarado, as subclasses devem ter seu codigo modificado 
    // para refletir a criacao de a mudanca
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) { 
        this.nome = nome;
    } 

    {
        System.out.println("Bloco de inicializaco de pessoa 1");
        
    }
    
    static {
        System.out.println("Bloco de inicializaco estatico de pessoa");
    }

    {
        System.out.println("Bloco de inicializaco de pessoa 2");
    }

    public String getNome() {
        return this.nome;
    }

    public void setCpf(String cpf) { 
        this.cpf = cpf;
    } 

    public String getCpf() {
        return this.cpf;
    }

    public void setEndereco(Endereco endereco) { 
        this.endereco = endereco;
    } 

    public Endereco getEndereco() {
            return this.endereco;
    }

    @Override
    public String toString() {
        if (this.endereco != null) {
            return "nome: " + this.nome + " cpf: " + this.cpf + " enderedo: " + this.endereco.toString();

        }
        return "nome: " + this.nome + " cpf: " + this.cpf + " endereco: sem endereco";
    } 
} 
