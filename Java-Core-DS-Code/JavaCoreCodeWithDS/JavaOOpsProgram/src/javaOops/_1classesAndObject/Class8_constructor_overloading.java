package javaOops._1classesAndObject;


public class Class8_constructor_overloading {
	
	  // constructor with one argument
	Class8_constructor_overloading(String name)
    {
        System.out.println("Constructor with one "
                           + "argument - String : " + name);
    }

    // constructor with two arguments
	Class8_constructor_overloading(String name, int age)
    {

        System.out.println(
            "Constructor with two arguments : "
            + " String and Integer : " + name + " " + age);
    }

    // Constructor with one argument but with different type than previous.. 
	Class8_constructor_overloading(long id)
    {
        System.out.println(
            "Constructor with one argument : "
            + "Long : " + id);
    }
    public static void main(String[] args)
    {
    	// Creating the objects of the class named 'Class8_constructor_overloading'
        // by passing different arguments

        // Invoke the constructor with one argument of
        // type 'String'.
    	Class8_constructor_overloading geek2 = new Class8_constructor_overloading("Shikhar");

        // Invoke the constructor with two arguments
    	Class8_constructor_overloading geek3 = new Class8_constructor_overloading("Dharmesh", 26);

        // Invoke the constructor with one argument of
    	Class8_constructor_overloading geek4 = new Class8_constructor_overloading(325614567);
    }
    
}
