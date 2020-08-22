package com.lgcirilo.javacore.classenaoinstanciavel.test;

import com.lgcirilo.javacore.classenaoinstanciavel.classes.NaoInstanciavel;

public class NaoInstanciavelTest {
    public static void main(String[] args) {
	    // a linha abaixo gera um erro de compilacao se o construtor da classe pretendida for estatico
        //NaoInstanciavel ni = new NaoInstanciavel(); // deve gerar erro de compilacao

		System.out.println(NaoInstanciavel.souEstatico());
	}
}
