package com.lgcirilo.introducao;

/*
Array initialization
Multidimensional arrays
*/
class Aula22 {
	public static void main(String[] args) {	
			// unidimensional array inline initialization
			int[] arr1 = {1, 2, 3};
			int[] arr2 = new int[] {4, 5, 6};

			// unidimensional array initialized to default values for type (0 in case of inteer)
			int[] arr3 = new int[3];
			
			// unidimensional array initialized to default values for type (/0000 in case of char)
			char[] arr4 = new char[3];
			
			// unidimensional array initialized to default values for type (false in case of boolean)
			boolean[] arr5 = new boolean[3];
			
			// unidimensional array initialized to default values for type (0 in case of lon)
			long[] arr6 = new long[3];
			
			// unidimensional array initialized to default values for type (0.0 in case of float)
			float[] arr7 = new float[3];

			//unidimensional array initialized to default values for type (0.0 in case of double)
			double[] arr8 = new double[3];
			
			// unidimensional array initialized to default values for type (null in case of Strin)
			String[] arr9 = new String[3];
			
			// unidimensional array initialized to default values for type (null in case of Object)
			Object[] arr10 = new Object[3];
			
			int[][] multi = new int[3][];
			multi[0] = new int[] {3,6,9};
			multi[1] = new int[5];
			multi[2] = new int[] {2, 4, 6};
	}
}

