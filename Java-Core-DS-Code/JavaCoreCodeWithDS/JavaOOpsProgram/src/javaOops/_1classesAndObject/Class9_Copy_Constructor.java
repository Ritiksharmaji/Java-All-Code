package javaOops._1classesAndObject;
public class Class9_Copy_Constructor {
	
	// Instance variables
    private String name;
    private int age;

    // Parameterized Constructor
    public Class9_Copy_Constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Class9_Copy_Constructor(Class9_Copy_Constructor obj) {
        this.name = obj.name;
        this.age = obj.age;
    }

    // Method to display values
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

	
    public static void main(String[] args)
    {
    	Class9_Copy_Constructor obj1 = new Class9_Copy_Constructor("John", 25); // Original Object
    	Class9_Copy_Constructor obj2 = new Class9_Copy_Constructor(obj1); // Copy Constructor

         obj1.display(); // Output: Name: John, Age: 25
         obj2.display(); // Output: Name: John, Age: 25
    }
    
}
