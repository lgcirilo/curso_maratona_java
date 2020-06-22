package com.lgcirilo.javacore.associacao.test;

import com.lgcirilo.javacore.associacao.classes.Aluno;
import com.lgcirilo.javacore.associacao.classes.Professor;
import com.lgcirilo.javacore.associacao.classes.Local;
import com.lgcirilo.javacore.associacao.classes.Seminario;
import java.util.ArrayList;

public class AssociacaoTest {
   public static void main(String[] args) {
       Aluno aluno = new Aluno("Gustavo Cirilo", 43);
       Aluno aluno2 = new Aluno("Luke Skywalker", 22);

	   Seminario seminario = new Seminario("how to how to");
	   Professor professor = new Professor("yoda", "the force");
	   Local local = new Local("the cave", "dagobah");

	   aluno.setSeminario(seminario);
	   aluno2.setSeminario(seminario);
	   
	   seminario.setProfessor(professor);
	   // seminario.setLocal(local);

	   // ArrayList<Aluno> alunos = new ArrayList<>();
	   // alunos.add(aluno);
	   // alunos.add(aluno2);
	   // seminario.setAlunos(alunos);

       ArrayList<Seminario> seminarios = new ArrayList<>();
	   seminarios.add(seminario);
	   professor.setSeminarios(seminarios);

	   System.out.println(seminario.toString());
   }
}
