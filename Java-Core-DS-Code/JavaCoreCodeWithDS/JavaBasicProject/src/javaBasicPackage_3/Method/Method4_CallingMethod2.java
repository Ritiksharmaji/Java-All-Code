package javaBasicPackage_3.Method;

public class Method4_CallingMethod2 {
	class test {
	    // Static method
	    static void hello()
	    {
	        System.out.println("Hello");
	    }
	}
	
	static void bye()
    {
        System.out.println("Bye");
    }
	 public static void main(String[] args) {
	      
	        // calling the Method 1 Accessing method for inner class
	        //hello(); it will show a  error
	        test.hello();
	        // main class 
	        bye();
	    }
}
