package com.lgcirilo.javacore.exceptions.classes;

import java.util.List;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class ListOfNumbers {
    private List<Integer> list;
    private static final int SIZE = 10;

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public List getList() {
        return this.list;
    }

    public ListOfNumbers() {
        list = new ArrayList<Integer>();
        for (int i = 0; i < SIZE; i++) {
            list.add(i);
        }
    }


    public void writeList() {
        PrintWriter out = null;

        try {
            out = new PrintWriter(new FileWriter("OutFile.txt"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < SIZE; i++) {
            out.println("Value at: " + i + " = " + list.get(i));
        }
        out.close();
    }   
}
