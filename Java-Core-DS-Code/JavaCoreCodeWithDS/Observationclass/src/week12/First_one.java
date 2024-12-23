package week12;
//import java.util.*;
import java.io.IOException; 
//public class ExceptionsAnamata {
    
//}

public class First_one {
	static void ThrowsException()throws IOException{  
        throw new IOException("device error");//checked exception  
    } 
    static void ThrowsExceptionHandled() {
        try {
            ThrowsException();
        } catch (Exception anukunta) {
            System.out.println("Exception Encountered " + anukunta.getMessage());
        }
    }
    
    public static void main(String[]args) {
        ThrowsExceptionHandled();
        try {
            int A = args.length;
            int B = 27 / A;
            System.out.println("Division = " + B);
        } catch (ArithmeticException anukunta) {
            System.out.println("Invalid Division " + anukunta.getMessage());
        } finally {
            System.out.println();
            System.out.println("==============================");
            System.out.println("Exception Handling Completed");
            System.out.println("==============================");
            System.out.println();
        }
        
    }

}
