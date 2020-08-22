package com.lgcirilo.introducao;

import java.util.Scanner;

class Randoms {
    public void gen(int range) {
        boolean[] seen = new boolean[range];
	int count = 0;
	int methodCalls = 0;
	System.out.println("Gerando numeros de 0 a " + (range - 1));
	while(count < seen.length) {
		int cur = (int) Math.floor(Math.random() * range);
		methodCalls++;
		if(seen[cur] == false) {
      			System.out.println("####Gerado o numero " + cur + "####");
			seen[cur] = true;
			count++;
 		} else {
      			System.out.println("numero " + cur + " jah gerado ");
		}
	}
	System.out.println("Metodo executado " + methodCalls + " vezes.");
    }

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	try {
	    int range = Integer.parseInt(in.next());
	    Randoms rnd = new Randoms();
	    rnd.gen(range);        
	} catch (NumberFormatException e) {
	    throw new NumberFormatException();
	}   
    }
}
