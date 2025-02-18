package javaBasicPackage_6.Interface;

interface in1 {
 final int a = 10;

 // public and abstract
 void display();
}

//Class that implements the interface
class Interface_14_Interface implements in1 {

 public void display() { 
   
   System.out.println("Geek"); 
 }

 public static void main(String[] args)
 {
	 Interface_14_Interface t = new Interface_14_Interface();
     t.display();
     System.out.println(a);
 }
}
