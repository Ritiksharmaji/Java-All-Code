package exceptionHandle.CustomException;

//A Class that represents user-defined exception
class MyException extends Exception {
 public MyException(String m) {
     super(m);
 }
}

public class CustomException_Class1 {
	
	public static void main(String args[]) {
        try {
            // Throw an object of user-defined exception
            throw new MyException("This is a custom exception");  
        }
        catch (MyException ex) {
            System.out.println("Caught");  // Catch and print message
            System.out.println(ex.getMessage());  
        }
    }
	

}
