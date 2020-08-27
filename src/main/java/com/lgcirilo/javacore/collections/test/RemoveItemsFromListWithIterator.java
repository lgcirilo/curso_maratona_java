package com.lgcirilo.javacore.collections.test;

import com.lgcirilo.javacore.collections.classes.Produto;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemoveItemsFromListWithIterator {
    public static void main(String[] args) {
        List<Produto> produtos = new LinkedList<>();
        produtos.add(new Produto("123", "Laptop lenovo", 2000.0));
        produtos.add(new Produto("012", "galaxy s7", 3250.5));
        produtos.add(new Produto("321", "Picanha", 26.0));
        produtos.add(new Produto("012", "galaxy s7", 3250.5));
        produtos.add(new Produto("879", "teclado razer", 1000.0));
        produtos.add(new Produto("012", "galaxy s7", 3250.5));

        Iterator<Produto> produtoIterator = produtos.iterator();
        while (produtoIterator.hasNext()) {
            Produto nextProduct = produtoIterator.next();
            if (nextProduct.getSerialNumber().compareTo("012") == 0) {
                produtoIterator.remove();
            }
        }
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}
