package com.lgcirilo.javacore.strings.test;

public class StringTest {

    public static void main(String[] args) {
        String nome = "Gustavo";
        /*
            does nothing to variable name because Strings are immutable
            nome.concat(" Cirilo");
         */
        nome = nome.concat(" Cirilo");
        System.out.println(nome);

        /* String class useful methods */
        String teste = "Goku";
        String teste2 = "goku";
        String aseos = "AaaaOoo";
        String spaces = "   like this      ";

        System.out.println(teste.charAt(3));
        System.out.println(teste.equalsIgnoreCase(teste2)); // should be true
        System.out.println(teste.length());
        System.out.println(aseos.replace('a', 'o'));
        System.out.println(teste.toLowerCase());
        System.out.println(teste2.toUpperCase());
        System.out.println(teste.substring(0,3));
        System.out.println("before the string was \"" + spaces + "\"." + " now it is \"" + spaces.trim() + "\"");
    }
}
