package com.lgcirilo.javacore.wrappers.test;

public class WrappersTest {
    public static void main(String[] args) {
        byte bytePrimitivo = 1;
        short shortPrimitvo = 1;
        int intPrimitivo = 10;
        long longPrimitivo = 10;
        float floatPrimitivo = 10;
        double doublePrimitivo = 100;
        char charPrimtivo = 'a';
        boolean booleanPrimitivo = true;

        /* autoboxing */
        Byte byteWrapper = 1;
        Short shortWrapper = 1;
        Integer intWrapper = 10;
        Long longWrapper = 10L;
        Float floatWrapper = 10F;
        Double doubleWrapper = 100D;
        Character charWrapper = 'a';
        Boolean booleanWrapper = true;

        /* unboxing */
        byte b = byteWrapper;
        short s = shortWrapper;
        int i = intWrapper;
        long l = longWrapper;
        float f = floatWrapper;
        double d = doubleWrapper;
        char c = charWrapper;
        boolean bool = booleanWrapper;

        String s1 = "1";
        String s2 = "1";
        String s3 = "10";
        String s4 = "10";
        String s5 = "0";
        String s6 = "100";
        String s8 = "true";

        Byte byte1 = Byte.parseByte(s1);
        Short short1 = Short.parseShort(s2);
        Integer integer1 = Integer.parseInt(s3);
        Long long1 = Long.parseLong(s4);
        Float float1 = Float.parseFloat(s5);
        Double double1 = Double.parseDouble(s6);
        Boolean boolean1 = Boolean.parseBoolean(s8);



    }
}
