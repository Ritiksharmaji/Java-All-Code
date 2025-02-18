package javaBasicPackage_5_CommandLineAndVarVariable;

public class VarVariable_CLass5_Using_Array {
	static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3};
        printArray(numbers);

	}

}
