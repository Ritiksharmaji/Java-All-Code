package Abstract_class;

    class GFG {
    // static variable
    static int a = 40;
  
    // instance variable
    int b = 50;
  
    void simpleDisplay()
    {
        System.out.println(a);
        System.out.println(b);
    }
  
    // Declaration of a static method.
    static void staticDisplay()
    { 
      System.out.println(a); 
    }
    }

public class Staticmethod {
	public static void main(String[] args)
	{
		GFG obj = new GFG();
		obj.simpleDisplay();

		// Calling static method.
// static method must be call by using class name not object of class
		// or nahi direct 
		GFG.staticDisplay();
	}

}
