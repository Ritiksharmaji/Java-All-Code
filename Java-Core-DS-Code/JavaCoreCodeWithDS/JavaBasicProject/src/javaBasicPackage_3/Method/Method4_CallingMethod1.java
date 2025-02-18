package javaBasicPackage_3.Method;

public class Method4_CallingMethod1 {
	// User-defined method
    void hello() {
        System.out.println("This is a user-defined method.");
    }
    public static void main(String[] args) {
      
        // Create an object
    	Method4_CallingMethod1 obj = new Method4_CallingMethod1(); 
      
        // Call the method
        obj.hello();          
    }
}
