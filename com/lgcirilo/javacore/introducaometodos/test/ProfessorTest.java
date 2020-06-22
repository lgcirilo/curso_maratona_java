package com.lgcirilo.javacore.introducaometodos.test;

import com.lgcirilo.javacore.introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
		Professor prof = new Professor();
		Professor prof2 = new Professor();
		prof.setNome("Gustavo Cirilo");
		prof.setMatricula("93212453");
		prof.setRg("11111111111");
		prof.setCpf("12345678909");
		prof2.setNome("Gui");
		prof2.setMatricula("00000000453");
		prof2.setRg("222222222");
		prof2.setCpf("12345678000");
        prof.imprime();
        prof2.imprime();
	}	
}
