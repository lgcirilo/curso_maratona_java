package com.lgcirilo.javacore.introducaometodos.test;

import com.lgcirilo.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		calc.somaDoisNumeros();
		calc.subtraiDoisNumeros();
		calc.multiplicaDoisNumeros(5, 5);
		System.out.println(calc.divideDoisNumeros(40, 4));
		int soma = calc.somaVarArgs(1,2,3,4,5,6,7,8);
		System.out.println(soma);
	}
}
