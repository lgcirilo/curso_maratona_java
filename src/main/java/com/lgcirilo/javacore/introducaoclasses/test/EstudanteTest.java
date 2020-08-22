package com.lgcirilo.javacore.introducaoclasses.test;

//import Users.luizgustavosantoscirilo.study.curso_maratona_java.com.lgcirilo.javacore.introducaoclasse;
import com.lgcirilo.javacore.introducaoclasses.classes.Estudante;

class EstudanteTest {
    public static void main(String[] ars) {
			Estudante joao = new Estudante();
			joao.setNome("Joao");
			joao.setMatricula("1234");
			joao.setIdade(12);
			
			System.out.println(joao.getNome());
			System.out.println(joao.getMatricula());
			System.out.println(joao.getIdade());
	}

}
