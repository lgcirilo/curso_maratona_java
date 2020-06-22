package com.lgcirilo.javacore.introducaoclasses.test;

import com.lgcirilo.javacore.introducaoclasses.classes.Carro;

class CarroTest {
	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.setPlaca("OEJ4426");
		carro.setModelo("Civic");
		carro.setVelocidadeMaxima(200f);

		System.out.println(carro.getPlaca());
		System.out.println(carro.getModelo());
		System.out.println(carro.getVelocidadeMaxima());
	}
}

