package com.lgcirilo.javacore.interfaces.classes;

public class Produto implements Tributavel, Transportavel {
    private String nome;
    private double peso;
    private double preco;
    private double precoFinal; 
    private double valorFrete;

    public Produto() { }

    public Produto(String nome, double peso, double preco) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }

    public double getPrecoFinal() {
        return this.precoFinal;
    }

    public double getValorFrete() {
        return this.valorFrete;
    }

    @Override
    public void calcularImposto() {
        precoFinal = this.preco + this.preco * IMPOSTO;
    }
    
    @Override
    public void calculaFrete() {
        this.valorFrete = this.preco / peso * 0.1;
    }

    @Override
    public String toString() {
        return "Produto{nome=" + this.nome +
               ", peso=" + this.peso +
               ", preco=" + this.preco +
               ", precoFinal=" + this.precoFinal +
               ", valorFrete=" + this.valorFrete +
               '}';
    }
}
