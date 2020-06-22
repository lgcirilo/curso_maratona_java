package com.lgcirilo.javacore.interfaces.classes;

public interface Tributavel {
    // uma interface pode ter atributos, porem todos devem ser public static final(constantes)
    public static final double IMPOSTO = 0.2;
    // todos os metodos de uma interface sao implicitamente publicos e abstratos
    void calcularImposto();
}

