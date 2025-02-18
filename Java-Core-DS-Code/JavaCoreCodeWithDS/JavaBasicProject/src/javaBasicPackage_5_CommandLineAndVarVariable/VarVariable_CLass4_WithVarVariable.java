package javaBasicPackage_5_CommandLineAndVarVariable;

public class VarVariable_CLass4_WithVarVariable {
	 static void sum(int... numbers) {
	        int total = 0;
	        for (int num : numbers) {
	            total += num;
	        }
	        System.out.println("Sum: " + total);
	    }

	public static void main(String[] args) {
		 	sum(10, 20);
	        sum(10, 20, 30);
	        sum(5, 10, 15, 20, 25);

	}

}
