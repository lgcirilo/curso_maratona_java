package com.lgcirilo.javacore.exceptions.runtimeexception.test;


public class RuntimeExceptionTest {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();        
        }
        System.out.println("pegou o erro no bloco try/catch e continuou a execucao");
    }
}
