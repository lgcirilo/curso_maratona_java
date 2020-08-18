package com.lgcirilo.javacore.collections.classes;

import java.util.Comparator;

public class ByPriceComparator implements Comparator<Produto> {
    public int compare(Produto p1, Produto p2) {
        double diff = p1.getPreco() - p2.getPreco();
        if(diff > 0) return 1;
        if(diff < 0) return -1;
        return 0;
    }
}