package javaBasicPackage_6.Interface;

//Animal is a Parent class
class Animal 
{
 public void eat()
 {
     System.out.println("Animal is eating");
 }
}

//Dog is derived from Animal class
class Interface_9_Dog extends Animal 
{
 public static void main(String args[])
 {
     // Creating object of Dog class
	 Interface_9_Dog d = new Interface_9_Dog();

     // Dog can access eat() method
       // of Animal class
     d.eat();
 }
}
