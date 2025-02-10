package javaOops._4Inheritance;

//Interface (Supports Multiple Inheritance)
interface AA {
 void methodA();
}

//Class B implements Interface A
class BB implements AA {
 public void methodA() {
     System.out.println("Method A from Interface A, implemented in Class B.");
 }

 void methodB() {
     System.out.println("Method B from Class B.");
 }
}

//Class C implements Interface A
class CC implements AA {
 public void methodA() {
     System.out.println("Method A from Interface A, implemented in Class C.");
 }

 void methodC() {
     System.out.println("Method C from Class C.");
 }
}

//Class D extends B (Multilevel Inheritance)
class DD extends BB {
 void methodD() {
     System.out.println("Method D from Class D.");
 }
}

//Class E extends C (Multilevel Inheritance)
class E extends CC {
 void methodE() {
     System.out.println("Method E from Class E.");
 }
}

//Main Class (Driver Class)
public class Inheritance7_Hybrid_Inheritance {
 public static void main(String[] args) {
     DD objD = new DD();
     objD.methodA();  // Inherited from Interface A
     objD.methodB();  // Inherited from Class B
     objD.methodD();  // Own method in Class D

     System.out.println("----------------------");

     E objE = new E();
     objE.methodA();  // Inherited from Interface A
     objE.methodC();  // Inherited from Class C
     objE.methodE();  // Own method in Class E
 }
}
