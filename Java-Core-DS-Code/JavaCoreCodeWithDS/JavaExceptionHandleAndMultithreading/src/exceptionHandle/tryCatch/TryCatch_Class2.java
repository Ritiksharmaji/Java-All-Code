package exceptionHandle.tryCatch;

public class TryCatch_Class2 {
	
	public static void main(String[] args) {
		 try {
	          
	            // Outer try block
	            System.out.println("Outer try block started");

	            try {
	                // Inner try block 1
	                int n = 10;
	                int res = n / 0;  // This will throw ArithmeticException
	            } catch (ArithmeticException e) {
	                System.out.println
	                  ("Caught ArithmeticException in inner try-catch: " + e);
	            }

	            try {
	              
	                // Inner try block 2
	                String s = null;
	                System.out.println(s.length());  // This will throw NullPointerException
	            } catch (NullPointerException e) {
	                System.out.println
	                  ("Caught NullPointerException in inner try-catch: " + e);
	            }

	        } catch (Exception e) {
	          
	            // Outer catch block
	            System.out.println
	              ("Caught exception in outer try-catch: " + e);
	        } finally {
	          
	            // Finally block
	            System.out.println("Finally block executed");
	        }
	}
}
