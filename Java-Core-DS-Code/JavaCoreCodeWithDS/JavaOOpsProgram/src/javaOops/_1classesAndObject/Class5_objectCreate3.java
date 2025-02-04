package javaOops._1classesAndObject;

public class Class5_objectCreate3 {
	 static String name;
	    static float price;

	    static void set(String n, float p) {
	        name = n;
	        price = p;
	    }

	    static void get()
	    {
	        System.out.println("Software name is: " + name);
	        System.out.println("Software price is: " + price);
	    }

	    public static void main(String args[])
	    {
	    	Class5_objectCreate3.set("Visual studio", 0.0f);
	    	Class5_objectCreate3.get();
	    }
}
