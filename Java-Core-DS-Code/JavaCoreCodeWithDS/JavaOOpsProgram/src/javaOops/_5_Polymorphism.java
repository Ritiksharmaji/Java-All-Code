package javaOops;
//Java Program to Demonstrate Method Overloading and Overriding
//Parent Class
class Parent {

 // Method Declared
 public void func(){
     System.out.println("Parent Method func");
 }

 // Method Overloading
 public void func(int a){
     System.out.println("Parent Method func " + a);
 }
}

//Child Class
class Child extends Parent {

 // Method Overriding
 @Override 
   public void func(int a){
     System.out.println("Child Method " + a);
 }
}

//Main Method
public class _5_Polymorphism {
 public static void main(String args[]){
     Parent obj1 = new Parent();
     obj1.func();
     obj1.func(5);

     Child obj2 = new Child();
     obj2.func(4);
 }
}