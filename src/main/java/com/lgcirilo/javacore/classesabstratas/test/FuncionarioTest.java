package com.lgcirilo.javacore.classesabstratas.test;

import com.lgcirilo.javacore.classesabstratas.classes.Vendedor;
import com.lgcirilo.javacore.classesabstratas.classes.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Vendedor v = new Vendedor("storm trooper", "2222-2", 250, 3000);
        Gerente g = new Gerente("vader", "1111-1", 250);
        v.calculaSalario();
        g.calculaSalario();
        System.out.println(v);
        System.out.println(g);
    }
}
