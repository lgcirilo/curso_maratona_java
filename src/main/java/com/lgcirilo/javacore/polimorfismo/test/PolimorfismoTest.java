package com.lgcirilo.javacore.polimorfismo.test;

import com.lgcirilo.javacore.polimorfismo.classes.Gerente;
import com.lgcirilo.javacore.polimorfismo.classes.Vendedor;
import com.lgcirilo.javacore.polimorfismo.classes.Funcionario;
import com.lgcirilo.javacore.polimorfismo.classes.RelatorioPagamento;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("darth vader", 10000, 2250);
        Vendedor v = new Vendedor("storm trooper", 2000, 20000);
        RelatorioPagamento rel = new RelatorioPagamento();
        rel.relatorioPagamento(g);
        rel.relatorioPagamento(v);
    }
}
