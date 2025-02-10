package javaOops._1classesAndObject;
public class Class10_Object_Class {
	
	String n;  //name
	
	
    public Class10_Object_Class(String n) {
		this.n = n;
	}
	@Override
	public String toString() {
		return "Class10_Object_Class [n=" + n + "]";
	}
	public static void main(String[] args)
    {
		Class10_Object_Class p = new Class10_Object_Class("Geek");
	      
        // Custom string representation
        System.out.println(p.toString());
      
        // Default hash code value
        System.out.println(p.hashCode()); 
    }
    
}
