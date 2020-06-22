package com.lgcirilo.javacore.introducaometodos.sobrecargametodos.test;

import com.lgcirilo.javacore.introducaometodos.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Chica da Silva", "745973267234", 3555.2d);
        Funcionario funcionario2 = new Funcionario("Chica da Silva", "745973267234", 3555.2d, "1234235");
	    Funcionario funcionario3 = new Funcionario();	
		System.out.println(funcionario.toString());
		System.out.println(funcionario2.toString());
		System.out.println(funcionario3.toString());
	}
}
