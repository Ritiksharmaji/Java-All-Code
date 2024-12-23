package Firstpack;
class Animal
{  
String color="white"; 
Animal()
{
System.out.println("animal is created"); 
}  
void eat()
{
System.out.println("Animal eating...");
} 
}
class Dog extends Animal
{  
String color="black"; 
Dog()
{  
super();  
System.out.println("dog is created");  
}  
void eat()
{
super.eat();
System.out.println("Dog eating bread...");
}  
void printColor()
{  
System.out.println(color);
System.out.println(super.color);
}  
}
class Superdemo
{  
public static void main(String args[])
{  
Dog d=new Dog();  
d.eat();
d.printColor();
}
}
