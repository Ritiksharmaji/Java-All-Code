package javaOops._4Inheritance;

//Parent Class
class Animal {
 void eat() {
     System.out.println("This animal eats food.");
 }
}

//Child Class
class Dog extends Animal {
 void bark() {
     System.out.println("Dog barks.");
 }
}

//Main Class
public class Inheritance3_SingleInheritance1 {
 public static void main(String[] args) {
     Dog dog = new Dog();
     dog.eat();  // ✅ Inherited method from Animal
     dog.bark(); // ✅ Dog class method
 }
}
