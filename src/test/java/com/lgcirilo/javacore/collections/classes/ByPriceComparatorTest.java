package com.lgcirilo.javacore.collections.classes;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import com.lgcirilo.javacore.collections.classes.Produto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ByPriceComparatorTest {
    static ArrayList<Produto> produtos;

    @BeforeAll
    static public void beforeAll() {
        produtos = new ArrayList<>();
        produtos.add(new Produto("123", "Laptop lenovo", 2000.0));
        produtos.add(new Produto("321", "Picanha", 26.0));
        produtos.add(new Produto("879", "teclado razer", 1000.0));
        produtos.add(new Produto("012", "galaxy s7", 3250.5));
        produtos.add(new Produto("013", "galaxy s7", 20.9999999));
        produtos.add(new Produto("014", "galaxy s7", 20.9999998));
        produtos.add(new Produto("014", "galaxy s7", 20.9999998));
    }

    @Test
    @DisplayName("Price Comparator compare method")
    public void compareTest() {
        ByPriceComparator bpc = new ByPriceComparator();
        assertEquals(0, bpc.compare(produtos.get(0), produtos.get(0)));
        assertEquals(1, bpc.compare(produtos.get(0), produtos.get(1)));
        assertEquals(-1, bpc.compare(produtos.get(2), produtos.get(3)));
        assertEquals(1, bpc.compare(produtos.get(4), produtos.get(5)));
        assertEquals(-1, bpc.compare(produtos.get(5), produtos.get(4)));
        assertEquals(0, bpc.compare(produtos.get(5), produtos.get(6)));


    }
}
