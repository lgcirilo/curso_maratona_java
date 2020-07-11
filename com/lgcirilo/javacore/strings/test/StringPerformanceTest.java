package com.lgcirilo.javacore.strings.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        concatString(50000);
        long finish = System.currentTimeMillis();
        System.out.println("It took concatString " + (finish - start) + "ms");

        long start2 = System.currentTimeMillis();
        concatStringWithStringBuilder(50000);
        long finish2 = System.currentTimeMillis();
        System.out.println("It took concatStringWithStringBuilder " + (finish2 - start2) + "ms");

        long start3 = System.currentTimeMillis();
        concatStringWithStringBuffer(50000);
        long finish3 = System.currentTimeMillis();
        System.out.println("It took concatStringWithStringBuffer " + (finish3 - start3) + "ms");
    }
    private static String concatString(int size) {
        String str = "";
        for (int i = 0; i < size; i++) {
            str += i;
        }
        return str;
    }

    private static String concatStringWithStringBuilder(int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
        return sb.toString();
    }

    /* Use String buffer when you're worried about synchronization */
    private static String concatStringWithStringBuffer(int size) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
        return sb.toString();
    }
}
