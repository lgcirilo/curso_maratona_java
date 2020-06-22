package com.lgcirilo.javacore.enums.test;

import com.lgcirilo.javacore.enums.classes.Cliente;
import com.lgcirilo.javacore.enums.classes.Personalidade;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("vader", Personalidade.PESSOA_FISICA, Cliente.TipoPagamento.AA_VISTA);
        System.out.println(cliente);
    }
} 
