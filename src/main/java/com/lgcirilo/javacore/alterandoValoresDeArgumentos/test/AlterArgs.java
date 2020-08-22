package com.lgcirilo.javacore.alterandoValoresDeArgumentos.test;

public class AlterArgs {
    public void somaUm(int val) {
	    val = val + 1;
		System.out.println("val dentro do metodo somaUm: " + val);
	}

	public void somaUmInteger(Integer valor) {
        valor = valor + 1;
		System.out.println("val dentro do metodo somaUmInteger: " + valor);
	}	

	public void alteraValorDeArray(int[] arr) {
	    arr[2] = 3000;
		System.out.println("valor de arr[2] dentro do metodo alteraValorDeArray: " + arr[2]);
	}


    public static void main(String[] args) {
        int val = 10;
        Integer valor = 20;
		int[] arr = {1, 2, 3};
		AlterArgs aa = new AlterArgs();
		
		System.out.println("somaUm com argumento do tipo int");
		aa.somaUm(val);
		System.out.println("val fora do metodo somaUm: " + val);

		System.out.println("###########");
		System.out.println("somaUm com argumento do tipo Integer");
		aa.somaUmInteger(valor);
		System.out.println("val fora do metodo somaUmInteger: " + valor);

		System.out.println("###########");
		System.out.println("alteraValorDeArray");
		aa.alteraValorDeArray(arr);
		System.out.println("valor de arr[2] fora do metodo alteraValorDeArray: " + arr[2]);
	}
}
