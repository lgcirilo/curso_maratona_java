package com.lgcirilo.javacore.strings.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        /* useful StringBuilder methods */
        StringBuilder sb = new StringBuilder();
        sb.append("0123046789");
        System.out.println("Original String: " + sb.toString());
        String reversedString = sb.reverse().toString();
        System.out.println("Reversed String: " + reversedString);
        sb.reverse();
        System.out.println("Reversed back to original String: " + sb.toString());
        String deleteFirstTwoCharacters = sb.delete(0, 2).toString();
        System.out.println("Deleted first two characters: " + deleteFirstTwoCharacters);
        String insert = sb.insert(0, "01").toString();
        System.out.println("Inserted deleted characters back: " + insert);
        StringBuilder s = new StringBuilder();
    }
}
