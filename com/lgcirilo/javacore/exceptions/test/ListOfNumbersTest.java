package com.lgcirilo.javacore.exceptions.test;

import com.lgcirilo.javacore.exceptions.classes.ListOfNumbers;
import com.lgcirilo.javacore.exceptions.classes.ListOfNumbers2;

import java.io.File;
import java.io.FileNotFoundException;

public class ListOfNumbersTest {
    public static void main(String[] args) {
        File file = null;
        ListOfNumbers numbers = new ListOfNumbers();
        ListOfNumbers2 numbers2 = new ListOfNumbers2();
        numbers.writeList();
        try {
            file = new File("listOfNumbers2Input.txt");
            numbers2.readList(file);
        } catch (FileNotFoundException e) {
            System.err.println("File " + file.getName() + " not found.");
        }
    }
}
