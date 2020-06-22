package com.lgcirilo.javacore.introducaoclasses.classes;

public class Carro {
	private String placa;
	private String modelo;
	private float velocidadeMaxima;

	public String getPlaca() {
		return this.placa;
	}	


	public String getModelo() {
		return this.modelo;
	}	

	public float getVelocidadeMaxima() {
		return this.velocidadeMaxima;
	}	

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setVelocidadeMaxima(float velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
}

