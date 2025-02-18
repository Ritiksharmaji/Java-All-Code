package javaBasicPackage_5_CommandLineAndVarVariable;

public class VarVariable_CLass2 {

	 static void displayNumbers(int... numbers) {
	        System.out.println("Number of arguments: " + numbers.length);
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayNumbers(); // No arguments
        displayNumbers(10); // One argument
        displayNumbers(1, 2, 3, 4, 5); // Multiple arguments
		
		

	}

}
