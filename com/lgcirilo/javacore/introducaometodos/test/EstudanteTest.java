package com.lgcirilo.javacore.introducaometodos.test;

import com.lgcirilo.javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante s = new Estudante();
		Estudante t = new Estudante("gui", 7, 10, 10, 9.8);
		Estudante burrao = new Estudante("burrao", 17, 6, 6, 5.5);
		Estudante semNotas = new Estudante();
		s.setNome("guigui");
		s.setIdade(8);
		s.setNotas(new double[]{9.7, 9.8, 9.9});
        System.out.println(t.media());
        System.out.println(s.media());
        System.out.println(burrao.media());
		System.out.println(semNotas.media());
	}

}
