package javaBasicPackage_5_CommandLineAndVarVariable;

public class VarVariable_CLass5_Using_Array2 {
	 static void printNumbers(int... numbers) {
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

	public static void main(String[] args) {
		printNumbers(1, 2, 3); // No need to create an array

	}

}
