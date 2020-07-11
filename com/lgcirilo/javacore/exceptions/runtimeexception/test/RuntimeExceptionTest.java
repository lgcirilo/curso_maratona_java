package com.lgcirilo.javacore.exceptions.runtimeexception.test;


public class RuntimeExceptionTest {
    public static void main(String[] args) {
        try {
            divisao(10, 0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    private static void divisao(int num1, int num2) {
        int result = num1 / num2;
        System.out.println(result);
    }
}
