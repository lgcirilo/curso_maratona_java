package com.lgcirilo.javacore.colecoes.test;

import com.lgcirilo.javacore.colecoes.classes.Cellphone;

public class EqualsTest {
    public static void main(String[] args) {
        String nome1 = "Gustavo Cirilo";
        String nome2 = new String("Gustavo Cirilo");
        System.out.println(nome1 == nome2);
        System.out.println(nome1.equals(nome2));
        Integer num1 = 1;
        Integer num2 = new Integer(1);
        System.out.println(num1 == num2);
        System.out.println(num1.equals(num2));

        Cellphone c1 = new Cellphone("Iphone", "123456");
        Cellphone c2 =new Cellphone ("Iphone", "123456");
        System.out.println("c1 equals c2? "+ c1.equals(c2));
    }
}
