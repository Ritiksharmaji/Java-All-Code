package javaBasicPackage_6.Interface;

interface MyInterface {
    // Abstract method (No body, must be implemented)
    void abstractMethod();

    // Default method (Has a body, can be overridden)
    default void defaultMethod() {
        System.out.println("This is a default method in interface.");
    }

    // Static method (Has a body, cannot be overridden)
    static void staticMethod() {
        System.out.println("This is a static method in interface.");
    }
}

class MyClass implements MyInterface {
    // Implementing abstract method
    public void abstractMethod() {
        System.out.println("Abstract method implemented.");
    }

    // Overriding default method
    @Override
    public void defaultMethod() {
        System.out.println("Default method overridden.");
    }
}

public class Interface_6 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        
        obj.abstractMethod(); // Calls overridden method
        obj.defaultMethod();  // Calls overridden default method

        // Calling static method from interface (Cannot be called via object)
        MyInterface.staticMethod();
    }
}
