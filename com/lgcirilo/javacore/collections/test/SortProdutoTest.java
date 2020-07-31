package com.lgcirilo.javacore.collections.test;

import com.lgcirilo.javacore.collections.classes.ByPriceComparator;
import com.lgcirilo.javacore.collections.classes.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class SortProdutoTest {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("123", "Laptop lenovo", 2000.0));
        produtos.add(new Produto("321", "Picanha", 26.0));
        produtos.add(new Produto("879", "teclado razer", 1000.0));
        produtos.add(new Produto("012", "galaxy s7", 3250.5));
        Collections.sort(produtos, new ByPriceComparator());
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(3);
        pq.add(2);
        pq.add(4);
        pq.add(2);
        pq.add(3);
        System.out.println(pq.poll());
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
    }
}
