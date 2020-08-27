package com.lgcirilo.javacore.collections.test;

import com.lgcirilo.javacore.collections.classes.Produto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Produto laptop_lenovo = new Produto("123", "Laptop lenovo", 2000.0);
        Produto picanha = new Produto("321", "Picanha", 26.0);
        Produto teclado_razer = new Produto("879", "teclado razer", 1000.0);
        Produto galaxy_s7 = new Produto("012", "galaxy s7", 3250.5);
        Set<Produto> produtoSet = new HashSet<Produto>(); // use LinkedHashSet to keep insertion order
        produtoSet.add(laptop_lenovo);
        produtoSet.add(picanha);
        produtoSet.add(teclado_razer);
        produtoSet.add(galaxy_s7);
        Iterator<Produto> produtoIterator = produtoSet.iterator();
        while (produtoIterator.hasNext()) {
            System.out.println(produtoIterator.next());
        }
        for (Produto produto : produtoSet) {
            System.out.println(produto);
        }
    }
}
