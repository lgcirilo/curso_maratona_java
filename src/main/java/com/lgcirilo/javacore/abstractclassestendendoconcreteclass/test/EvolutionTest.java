package com.lgcirilo.javacore.abstractclassestendendoconcreteclass.test;

import com.lgcirilo.javacore.abstractclassestendendoconcreteclass.classes.Human;
import com.lgcirilo.javacore.abstractclassestendendoconcreteclass.classes.Language;

public class EvolutionTest {
    public static void main(String[] args) {
        Human h = new Human("this is me", 1, Language.FRENCH);
        System.out.println(h);
    }
}
