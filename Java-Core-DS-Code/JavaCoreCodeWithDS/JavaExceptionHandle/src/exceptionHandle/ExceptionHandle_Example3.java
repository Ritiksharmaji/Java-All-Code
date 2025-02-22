package exceptionHandle;

class ExceptionHandle_Example3 {
    public static void recursiveMethod() {
        recursiveMethod(); // Infinite recursion
    }

    public static void main(String[] args) {
        recursiveMethod();
    }

}
