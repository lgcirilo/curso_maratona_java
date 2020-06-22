package com.lgcirilo.javacore.modificadorestatico.classes;

public class Carro {
    // Velocidade limite deve ser de 240km/h
    private String nome;
	private double velocidadeMaxima;
	// atributos estaticos fazem parte da classe. utilizar o metodo set num atributo estatico 
	// modifica o valor do atributo para todos os objetos dessa classe
	private static double velocidadeLimite = 240;

	public Carro() {}

	public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
	}	

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
	}

	public String getNome() {
        return this.nome;
	}	

	public void setNome(String nome) {
        this.nome = nome;
	}

	public double getVelocidadeMaxima() {
        return this.velocidadeMaxima;
	}	

	public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
	}

    @Override
	public String toString() {
        return "-------------------\n" + "nome: " + this.nome + "\n" + "velocidade maxima: " + this.velocidadeMaxima + "\n" + "velocidadeLimite: " + this.velocidadeLimite + "\n" + "-------------------\n";
	}
}
