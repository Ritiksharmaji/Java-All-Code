package javaOops._1classesAndObject;

public class Class2_newInstance {
	 // Declaring and initializing string
    String n = "GeeksForGeeks";

	public static void main(String[] args) {
		 // Try block to check for exceptions
        try {
            // Correcting the class name to match "Geeks"
            //Class<?> c = Class.forName("Class2_newInstance");
        	Class<?> c = Class.forName("javaOops._1classesAndObject.Class2_newInstance");
          
            // Creating an object of the main class using reflection
            Class2_newInstance o = (Class2_newInstance) c.getDeclaredConstructor().newInstance();
          
            // Print and display
            System.out.println(o.n);
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (InstantiationException e) {
            e.printStackTrace();
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
	}

}
