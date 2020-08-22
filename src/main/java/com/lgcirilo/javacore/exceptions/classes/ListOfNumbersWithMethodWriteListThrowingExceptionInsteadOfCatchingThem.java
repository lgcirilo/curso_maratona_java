// This example was taken from oracle's java tutorial on exceptions

package com.lgcirilo.javacore.exceptions.classes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ListOfNumbersWithMethodWriteListThrowingExceptionInsteadOfCatchingThem {
    private List<Integer> list;
    private static final int SIZE = 10;

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public List getList() {
        return this.list;
    }

    public ListOfNumbersWithMethodWriteListThrowingExceptionInsteadOfCatchingThem() {
        list = new ArrayList<Integer>();
        for (int i = 0; i < SIZE; i++) {
            list.add(i);
        }
    }

    /**
     * In this example the method writeList is throwing the exceptions instead
     * of catching them.
     * Note that IndexOutOfBoundsException is an unchecked exception so it's not
     * mandatory to include it in the throws clause.
     */
    public void writeList(List<String> l) throws IOException, IndexOutOfBoundsException {
        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
            for (int i = 0; i < SIZE; i++) {
                out.println("Value at: " + i + " = " + list.get(i));
        }
        out.close();
    }
}
