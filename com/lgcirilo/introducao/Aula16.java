package com.lgcirilo.introducao;

// imprima todos os numeros pares de 0 a 100.000
class Aula16 {
	public static void main(String[] args) {
		int num  = 0;
		
		/*
		// using for
		for(int i = 0; i <= 100000; i+=2) {
			System.out.println(i);
		}
		*/

		/*
		// using while
		while(num <= 100000) {
			System.out.println(num);
			num += 2;
		}
		*/

		// using do while
		num = 0;
		do {
			System.out.println(num);
			num += 2;
		} while (num <= 100000);
	}

}

