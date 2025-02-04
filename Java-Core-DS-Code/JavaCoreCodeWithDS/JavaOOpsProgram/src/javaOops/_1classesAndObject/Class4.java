package javaOops._1classesAndObject;

public class Class4 {
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
	    	Class4.set("Visual studio", 0.0f);
	    	Class4.get();
	    }
}
