// criar lista de Srings (ou outro tipo wrapper) e percorrê-la usando for e foreach
// criar uma lista de Object e adicionar objeto de tipos diferentes. percorrê-la usandofor e foreach

package com.lgcirilo.javacore.collections.test;

import java.util.List;
import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list.add("Gustavo");
        list.add("Gui");
        list.add("Ro");

        list2.add("aaaaa");
        list2.add("bbbbb");
        list2.add("ccccc");
        list.addAll(list2);

        for (String obj: list) {
            System.out.println(obj);
        }
        list.add("Cirilo");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
