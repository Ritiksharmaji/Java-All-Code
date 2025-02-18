package javaBasicPackage_6.Interface;

class AAAA {
 int a;

 void set_A(int x) { 
       a = x; 
     System.out.println("Setting A's value to = " + x);
 }
}

//Class B derived from Class A
class BBB extends AAAA 
{
 int b;

 void set_B(int x) { 
       b = x; 
       System.out.println("Setting B's value to = " + b);
 }
}

//Class C also derived from Class A
class C extends AAAA 
{
 int c;
 void set_C(int x) {
       c = x;
       System.out.println("Setting C's value to = " + c);
 }
}

public class Interface_10_Hierarchical_Inheritance_3 
{
   public static void main(String[] args) 
   {
       C c = new C();
       c.set_C(5);
       c.set_A(50);
       
       BBB b = new BBB();
       b.set_B(10);
       b.set_A(15);
 }
}
