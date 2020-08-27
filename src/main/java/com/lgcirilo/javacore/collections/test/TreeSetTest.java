// in order to be used in NavigableSets, classes must implement comparable
// or a comparator must be passed to the NavigableSet constructor.

package com.lgcirilo.javacore.collections.test;

import com.lgcirilo.javacore.collections.classes.Produto;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Produto laptop_lenovo = new Produto("123", "Laptop lenovo", 2000.0);
        Produto picanha = new Produto("321", "Picanha", 26.0);
        Produto teclado_razer = new Produto("879", "teclado razer", 1000.0);
        Produto galaxy_s7 = new Produto("012", "galaxy s7", 3250.5);
        NavigableSet<Produto> produtoNavigableSet = new TreeSet<>();

    }
}
