package com.lgcirilo.javacore.exceptions.runtimeexception.classes;

public class MultiplasRuntimeException {
    public void test() throws ArithmeticException, IllegalArgumentException, ArrayIndexOutOfBoundsException{
            int num = (int) Math.floor(Math.random() * 3);
            switch (num) {
                case 0:
                    throw new ArrayIndexOutOfBoundsException();
                case 1:
                    throw new IllegalArgumentException();
                case 2:
                    throw new ArithmeticException();
                default:
                    break;
            }
    }
}

