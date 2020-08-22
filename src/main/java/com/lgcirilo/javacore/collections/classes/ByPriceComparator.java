package com.lgcirilo.javacore.collections.classes;

import java.util.Comparator;

public class ByPriceComparator implements Comparator<Produto> {
    public int compare(Produto p1, Produto p2) {
         return Double.compare(p1.getPreco(), p2.getPreco());
    }
}