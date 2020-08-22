package com.lgcirilo.javacore.exceptions.runtimeexception.test;

import com.lgcirilo.javacore.exceptions.runtimeexception.classes.MultiplasRuntimeException;

public class MultiplasRuntimeExceptionTest {
    public static void main(String[] args) {
        MultiplasRuntimeException mm = new MultiplasRuntimeException();
        for (int i = 0; i < 40; i++) {
            try {
                mm.test();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException");
            } catch (IllegalArgumentException e) {
                System.out.println("Caught IllegalArgumentException");
            } catch (ArithmeticException e ) {
                System.out.println("Caught ArithmeticException");
            }
        }
    }
}
