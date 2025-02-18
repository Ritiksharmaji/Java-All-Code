package javaBasicPackage_3.Method;

public class Method2_methodCall {

	// Method to print message
    public void printMessage() {
        System.out.println("Hello, Geeks!");
    }
    
	public static void main(String[] args) {
		
		// Create an instance of the Method class
		Method2_methodCall m = new Method2_methodCall();
        m.printMessage();  // Calling the method

	}

}
