package javaBasicPackage_3.Method;

class Method5_staticMethod {

// static method 
public static void greet(){
 
 System.out.println("Hello Geek!");
}
 public static void main (String[] args) {
   
    // calling the method directily
    greet();
     // calling the method  using the class name
    Method5_staticMethod.greet();  
 }
}
