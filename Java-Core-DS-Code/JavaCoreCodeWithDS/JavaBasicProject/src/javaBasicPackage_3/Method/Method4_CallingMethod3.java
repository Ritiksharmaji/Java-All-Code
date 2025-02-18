package javaBasicPackage_3.Method;

abstract class GFGhelp {
 // Creating abstract method
 abstract void check(String n);
}

//Main class extending to helper class
public class Method4_CallingMethod3 extends GFGhelp {

 public static void main(String[] args) {
   
     // Creating the instance of the class
	 Method4_CallingMethod3 ob = new Method4_CallingMethod3();

     // Accessing the abstract method
     ob.check("GFG");
 }

 // Extends the abstract method
 @Override void check(String n)
 {
     System.out.println(n);
 }
}
