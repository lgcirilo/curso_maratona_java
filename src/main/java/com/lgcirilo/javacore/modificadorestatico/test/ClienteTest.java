package com.lgcirilo.javacore.modificadorestatico.test;

import com.lgcirilo.javacore.modificadorestatico.classes.Cliente;


public class ClienteTest {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(); 
        Cliente c2 = new Cliente(); 
        Cliente c3 = new Cliente(); 
		System.out.println("Exibindo quantidade de parcelas possiveis");
		for(int parcela: c1.getParcelas()) {
            System.out.print(parcela + " ");
		}
		System.out.println();
	}
}

