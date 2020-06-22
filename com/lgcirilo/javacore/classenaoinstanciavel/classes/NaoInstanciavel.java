package com.lgcirilo.javacore.classenaoinstanciavel.classes;

public class NaoInstanciavel {
    // para que uma classe seja nao instanciavel eh necessario que seus contrutor seja privado
	private NaoInstanciavel() {}

	public static String souEstatico() {
        return "sou estatico";
	}
}

