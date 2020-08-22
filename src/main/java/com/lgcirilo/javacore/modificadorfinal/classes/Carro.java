package com.lgcirilo.javacore.modificadorfinal.classes;

// utilizar o modificar final para uma classe significa que nao sera possivel estende-la
public final class Carro {

    // - o modificador final num atributo faz com que seu valor não possa ser modificado (constante)
    // - a nomenclatura de uma variavel final deve seguir o padrao uppercase com underline para separar as palvras (e.g. PALAVRAS_SEPARADAS)
    // - um atributo static final deve ser inicializado no momento em que eh declarado ou num
    //   bloco de inicializacao estatico
    // - um atributo final (e nao static) pode ser inicializado no momento da declaracao, em bloco de inicializacao *NAO* estatico ou no construtor

    private static final double VELOCIDADE_FINAL = 250;
    // para variaveis final do tipo reference nao eh possivel atribui-la a um nova variavel, 
    // porem eh possivel alterar os campos da variavel (do objeto).
    private final Comprador comprador = new Comprador();
    private String nome;
    private String marca;

    // declarar um metodo como final faz com que ele nao possa ser sobrescrito
    // no entanto a sobrecarga eh possivel
    public final void metodoFinal() {

    } 
    public double getVelocidadeFinal() {
        return VELOCIDADE_FINAL;
    }
    
    public Comprador getComprador() {
        return comprador != null ? comprador : null;
    } 

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "{" +
        "nome='" + this.nome + '\'' + 
        ", marca='" + this.marca + '\'' +
        '}';
    }
}
