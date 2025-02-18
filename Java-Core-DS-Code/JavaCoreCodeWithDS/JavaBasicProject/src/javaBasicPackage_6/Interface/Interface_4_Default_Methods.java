package javaBasicPackage_6.Interface;

//interfaces can have methods from JDK 1.8 onwards
interface TestInterface
{
 final int a = 10;
 
   default void display() {
     System.out.println("hello");
 }
}

//A class that implements the interface.
class Interface_4_Default_Methods implements TestInterface
{
 // Driver Code
   public static void main (String[] args) {
	   Interface_4_Default_Methods t = new Interface_4_Default_Methods();
     t.display();
 }
}
