package com.lgcirilo.javacore.modificadorestatico.test; 

import com.lgcirilo.javacore.modificadorestatico.classes.Carro;

public class CarroTest {
	public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Audi", 275);
        Carro c3 = new Carro("Mercedes", 290);
    
	    System.out.println(c1.toString());
	    System.out.println(c2.toString());
		System.out.println(c3.toString());

	    // atributos estaticos fazem parte da classe. utilizar o metodo set num atributo estatico 
	    // modifica o valor do atributo para todos os objetos dessa classe
		System.out.println("#################");
		// Embora funcione, esta eh a forma errada de alterar um atributo static de uma classe. 
		// O correto eh ter um metodo estatico que realize essa operacao. 
		Carro.setVelocidadeLimite(210);
		
	    System.out.println(c1.toString());
	    System.out.println(c2.toString());
		System.out.println(c3.toString());
	}
}
