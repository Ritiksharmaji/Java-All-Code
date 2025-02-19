package exceptionHandle.tryCatch;

public class TryCatch_Class6_ChainedException2_initCause {
	
	public static void main(String[] args) {
        Exception e1 = new Exception("Higher-level exception");
        Exception e2 = new Exception("Original cause");

        e1.initCause(e2); // Setting the cause

        System.out.println(e1.getMessage());       // Higher-level exception
        System.out.println(e1.getCause().getMessage()); // Original cause
    }

}