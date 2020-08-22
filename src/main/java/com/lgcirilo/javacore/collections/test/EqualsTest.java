package com.lgcirilo.javacore.collections.test;

import com.lgcirilo.javacore.collections.classes.CellPhone;

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

        CellPhone c1 = new CellPhone("Iphone", "123456");
        CellPhone c2 =new CellPhone("Iphone", "123456");
        System.out.println("c1 equals c2? "+ c1.equals(c2));
    }
}
