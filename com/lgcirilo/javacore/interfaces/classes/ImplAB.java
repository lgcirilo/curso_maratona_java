package com.lgcirilo.javacore.interfaces.classes;

import com.lgcirilo.javacore.interfaces.intf.IntA;
import com.lgcirilo.javacore.interfaces.intf.IntB;

public class ImplAB implements IntA, IntB {
    public void intAMethodA() {
        System.out.println("IntAMethodA");
    }

    public void intAMethodB(){
        System.out.println("IntAMethodB");
    }

    public void intBMethodA() {
        System.out.println("IntBMethodA");
    }

    public void intBMethodB() {
        System.out.println("IntBMethodB");
    } 
}
