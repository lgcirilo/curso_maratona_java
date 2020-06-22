package com.lgcirilo.javacore.exceptions.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) {
        criaArquivo();
    }

    public static void criaArquivo() {
        File file = new File("teste.txt");
        try {
            System.out.println("Arquivo criado?: " + file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
