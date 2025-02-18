package javaBasicPackage_6.Interface;

interface testInterface {
    // public, static and final
    final int a = 10;
    // public and abstract
    void display();
}

//Class implementing interface
class TestClass implements testInterface {

 // Implementing the capabilities of
 // Interface
 public void display(){ 
   System.out.println("Geek"); 
 }
}
public class Interface_1 {
	public static void main(String[] args)
    {
        TestClass t = new TestClass();
        t.display();
        System.out.println(t.a);
    }
	

}
