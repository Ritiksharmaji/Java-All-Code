package week9;
class Animal
{ 
void eat()
{
System.out.println("eating...");
} 
} 
class Dog extends Animal
{ 
void eat()
{
System.out.println("eating bread...");
} 
} 
class Cat extends Animal
{ 
void eat()
{
System.out.println("eating rat...");
} 
} 
class Lion extends Animal
{ 
void eat()
{
System.out.println("eating meat...");
} 
} 

public class Runtimeplomri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a; 
		a=new Dog(); 
		a.eat(); 
		a=new Cat(); 
		a.eat(); 
		a=new Lion(); 
		a.eat(); 

	}

}
