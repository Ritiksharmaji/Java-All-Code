package javaOops._1classesAndObject;


public class Class7_Parameterized_Constructor {
	
	 // data members of the class.
    String name;
    int id;
    
    Class7_Parameterized_Constructor(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public static void main(String[] args)
    {
    	Class7_Parameterized_Constructor hello = 
    			new Class7_Parameterized_Constructor("Avinash", 68);
    	
    	 System.out.println("GeekName :" + hello.name
                 + " and GeekId :" + hello.id);
    }
    
}
