package javaOops._2Abstraction;
//Demonstrating Abstraction in Java
abstract class Geeks {
 abstract void turnOn(); // abstract method
 abstract void turnOff();
}

//Concrete class implementing the abstract methods
class TVRemote extends Geeks {
 @Override
 void turnOn() {
     System.out.println("TV is turned ON.");
 }

 @Override
 void turnOff() {
     System.out.println("TV is turned OFF.");
 }
}
public class Abstraction1 {
	
	public static void main(String[] args) {
        Geeks remote = new TVRemote();
        remote.turnOn();   
        remote.turnOff();  
    }

}
