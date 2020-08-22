package com.lgcirilo.javacore.introducaoclasses.test;

import com.lgcirilo.javacore.introducaoclasses.classes.Professor;

class ProfessorTest {
	public static void main(String[] args) {
		Professor prof = new Professor();
		prof.setNome("Gustavo Cirilo");
		prof.setMatricula("93212453");
		prof.setRg("11111111111");
		prof.setCpf("12345678909");

		System.out.println(prof.getNome());
		System.out.println(prof.getMatricula());
		System.out.println(prof.getRg());
		System.out.println(prof.getCpf());
	}
}

