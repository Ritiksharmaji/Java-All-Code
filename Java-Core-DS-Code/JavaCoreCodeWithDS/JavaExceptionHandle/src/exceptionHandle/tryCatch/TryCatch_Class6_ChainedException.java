package exceptionHandle.tryCatch;

public class TryCatch_Class6_ChainedException {
	
	public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
            System.out.println("Original Cause: " + e.getCause());
        }
    }

    public static void method1() throws Exception {
        try {
            method2();
        } catch (NullPointerException e) {
            // Wrapping NullPointerException into a new Exception
            throw new Exception("Exception in method1", e);
        }
    }

    public static void method2() {
        throw new NullPointerException("Null value found!"); // Root cause
    }

}