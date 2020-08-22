package com.lgcirilo.javacore.interfaces.test;

import com.lgcirilo.javacore.interfaces.classes.Produto;

public class ProdutoTest {
    public static void main(String[] agrs) {
        Produto p = new Produto("Laptop", 4, 3000);
        p.calcularImposto();
        p.calculaFrete();
        System.out.println(p);
    }
}
