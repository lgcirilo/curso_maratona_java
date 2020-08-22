package com.lgcirilo.javacore.exceptions.checkedexception.test;

import java.io.File;
import java.io.IOException;

// catch or specify requirement: code that might throw an exception must be enclosed by a try/catch statement that treats the exception or by a method that specifies it can throw the exceptionk:7
// only CheckedExceptions are subject to the catch or specify requirement. RuntimeExceptions and Errors are not.

public class CheckedExceptionTest {
    public static void main(String[] args) {
        try{
            criaArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void criaArquivo() throws IOException {
        File file = new File("teste.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado?: " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
