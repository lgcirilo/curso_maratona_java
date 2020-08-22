package com.lgcirilo.javacore.interfaces.test;

import com.lgcirilo.javacore.interfaces.intf.IntA;
import com.lgcirilo.javacore.interfaces.intf.IntB;
import com.lgcirilo.javacore.interfaces.classes.ImplAB;


public class InterfaceLimitingClassMethods {
    public static void main(String[] agrs) {
        IntA objIntA = new ImplAB(); 
        IntB objIntB = new ImplAB(); 

        // Method calls below are valid 
        objIntA.intAMethodA();
        objIntA.intAMethodB();
        objIntB.intBMethodA(); 
        objIntB.intBMethodB();
        
        // Method calls below are invalid. An object declared as IntA type is trying to call
        // methods from IntB type. Even though ImplAB class implements both IntA and IntB
        // declaring the object as IntA prevents it from accessing methods from IntB.
        // objIntA.intBMethodA();
        // objIntA.intBMethodB();


        // Method calls below are invalid. An object declared as IntB type is trying to call
        // methods from IntA type. Even though ImplAB class implements both IntA and IntB
        // declaring the object as IntB prevents it from accessing methods from IntA.
        // objIntB.intAMethodA();
        // objIntB.intAMethodB();
    }
}

