package exceptionHandle;

class ExceptionHandle_Example2 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length()); // Causes NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

}
