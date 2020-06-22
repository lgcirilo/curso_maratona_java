// illustrates how to use forEach with unidimensinal and multidimensional arrays
package com.lgcirilo.introducao;

class ArrayForEach {
	
	public static void unidimensionalForEach(int elements) {
		// unidimensional array creation
		int[] uni = new int[elements];
		for(int i = 0; i < elements; i++) {
			uni[i] = i + 1;
		}

		// forEach looping though all array elements
		for(int num: uni) {
			System.out.println(num);
		}
	}

	public static void multidimensionalForEach(int rows, int cols) {
		// multidimensional array creation
		int[][] multi = new int[rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				multi[i][j] = i + j;
			}
		}

		// forEach looping though array elements
		for(int[] row: multi) {
			for(int num: row) {
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args) {
		unidimensionalForEach(10);
		multidimensionalForEach(5, 5);
	}
}
