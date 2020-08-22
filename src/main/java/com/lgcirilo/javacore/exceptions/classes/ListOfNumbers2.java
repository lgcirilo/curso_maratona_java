//Add a readList method to ListOfNumbers.java.
//This method should read in int values from a file,
//print each value, and append them to the end of the vector.
//You should catch all appropriate errors. You will also need a text
//file containing numbers to read in.

package com.lgcirilo.javacore.exceptions.classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class ListOfNumbers2 {
    private List<Integer> list;
    private static final int SIZE = 10;


    public ListOfNumbers2() {
        list = new Vector<Integer>();
        for (int i = 0; i < SIZE; i++) {
            list.add(i);
        }

    }

    public void readList(File file) throws FileNotFoundException {
        final Scanner reader = new Scanner(file);
        while(reader.hasNext()) {
            list.add(reader.nextInt());
        }
        for (Integer num: list) {
            System.out.println(num);
        }
    }

    public void writeList() {
        try (PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"))) {
            for (int i = 0; i < SIZE; i++) {
                out.println("Value at: " + i + " = " + list.get(i));
            }
        } catch (IOException | IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

}




