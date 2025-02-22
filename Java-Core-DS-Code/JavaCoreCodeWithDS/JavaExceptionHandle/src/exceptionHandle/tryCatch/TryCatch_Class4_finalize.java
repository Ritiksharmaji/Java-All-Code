package exceptionHandle.tryCatch;

public class TryCatch_Class4_finalize {
	
	public static void main(String[] args) {
		try {
            System.out.println("Inside try block");
            int result
                = 10 / 0; // This will cause an exception
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught: "
                               + e.getMessage());
        }
        finally {
            System.out.println(
                "finally block always execute");
        }
	}
}
