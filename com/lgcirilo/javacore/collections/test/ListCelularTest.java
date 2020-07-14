package com.lgcirilo.javacore.collections.test;

import com.lgcirilo.javacore.collections.classes.CellPhone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListCelularTest {
    public static void main(String[] args) {
        CellPhone iphone2 = new CellPhone("iphone 6s", "123456");
        CellPhone iphone1 = new CellPhone("iphone 6", "12345");
        CellPhone iphone3 = new CellPhone("iphone 7", "1234567");
        CellPhone iphone4 = new CellPhone("iphone x", "01234567");
        List<CellPhone> cells = new ArrayList<>();
        cells.add(iphone1);
        cells.add(iphone2);
        cells.add(iphone3);
        cells.add(iphone4);
        Collections.sort(cells);
        for (CellPhone c : cells) {
            System.out.println(c);
        }

    }
}
