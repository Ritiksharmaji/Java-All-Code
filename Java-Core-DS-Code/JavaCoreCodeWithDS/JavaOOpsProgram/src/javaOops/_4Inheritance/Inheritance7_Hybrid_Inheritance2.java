package javaOops._4Inheritance;

//Base Class
class AAA {
 void methodA() {
     System.out.println("Method A from Class A.");
 }
}

//Class B extends A (Multilevel Inheritance)
class BBB extends AAA {
 void methodB() {
     System.out.println("Method B from Class B.");
 }
}

//Class C extends B (Hierarchical Inheritance)
class CCC extends BBB {
 void methodC() {
     System.out.println("Method C from Class C.");
 }
}

//Class D extends B (Hierarchical Inheritance)
class DDD extends BBB {
 void methodD() {
     System.out.println("Method D from Class D.");
 }
}

//Main Class
public class Inheritance7_Hybrid_Inheritance2 {
 public static void main(String[] args) {
	 CCC objC = new CCC();
     objC.methodA();  // Inherited from Class A
     objC.methodB();  // Inherited from Class B
     objC.methodC();  // Own method in Class C

     System.out.println("----------------------");

     DDD objD = new DDD();
     objD.methodA();  // Inherited from Class A
     objD.methodB();  // Inherited from Class B
     objD.methodD();  // Own method in Class D
 }
}
