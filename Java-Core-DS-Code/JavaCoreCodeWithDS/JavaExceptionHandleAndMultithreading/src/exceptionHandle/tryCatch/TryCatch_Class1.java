package exceptionHandle.tryCatch;

public class TryCatch_Class1 {
	
	public static void main(String[] args) {
        try {
          
            // This will throw an ArithmeticException
            int res = 10 / 0;
        }
        // Here we are Handling the exception
        catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }

        // This line will executes weather an exception
        // occurs or not
        System.out.println("I will always execute");
    }

}
