package com.lgcirilo.javacore.sobrescrita.test;

import com.lgcirilo.javacore.sobrescrita.classes.Pessoa;


public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Sequoia");
        p.setIdade(850);
        System.out.println(p);
    }
}
