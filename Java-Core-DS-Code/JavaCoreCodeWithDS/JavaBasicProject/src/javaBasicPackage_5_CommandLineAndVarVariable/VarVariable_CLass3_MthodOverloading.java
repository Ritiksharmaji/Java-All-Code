package javaBasicPackage_5_CommandLineAndVarVariable;

public class VarVariable_CLass3_MthodOverloading {
	 static void sum(int a, int b) {
	        System.out.println("Sum (2 args): " + (a + b));
	    }

	    static void sum(int a, int b, int c) {
	        System.out.println("Sum (3 args): " + (a + b + c));
	    }

	public static void main(String[] args) {
		sum(10, 20);
        sum(10, 20, 30);

	}

}
