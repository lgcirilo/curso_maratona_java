/**
 * This example was taken from oracle's java tutorial on exceptions
 *
 * "Here's the bottom line guideline: If a client can reasonably be expected
 * to recover from an exception, make it a checked exception. If a client
 * cannot do anything to recover from the exception, make it an unchecked
 * exception."
 */

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
        try (PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"))) {
            for (int i = 0; i < SIZE; i++) {
                out.println("Value at: " + i + " = " + list.get(i));
            }
        } catch (IOException | IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        /**
         * The code above is a shorter version of this commmented code. Note the absence of a
         * finally block to handle resource releasing. This is accomplished automatically by the
         * try-with-resources clause
         *
         * PrintWriter out = null;
         *
         * try {
         *     out = new PrintWriter(new FileWriter("OutFile.txt"));
         *      for (int i = 0; i < SIZE; i++) {
         *          out.println("Value at: " + i + " = " + list.get(i));
         *      }
         * } catch (IOException e) {
         *     System.out.println("Caught IOException" + e.getMessage());
         * } catch (IndexOutOfBoundsException e) {
         *     System.err.println("Caught IndexOutOfBoundsException" + e.getMessage());
         * } finally {
         *     if(out != null) {
         *         System.out.println("Closing PrintWriter");
         *         out.close();
         *     } else {
         *         System.out.println("PrintWriter not open");
         *     }
         * }
         *
         */

        /**
         * Multiple exception can be caught in a single catch block.
         * The try/catch block above can be rewritten as:
         *          catch (IOException | IndexOutOfBoundsException e) {
         *              System.err.println(e.getMessage());
         *          }
         */

    }
}
