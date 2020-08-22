package com.lgcirilo.javacore.collections.classes;

import java.util.Comparator;

public class ByNameComparator implements Comparator<Produto> {
    @Override
    public int compare(Produto produto1, Produto produto2) {
        return produto1.compareTo(produto2);
    }
}
