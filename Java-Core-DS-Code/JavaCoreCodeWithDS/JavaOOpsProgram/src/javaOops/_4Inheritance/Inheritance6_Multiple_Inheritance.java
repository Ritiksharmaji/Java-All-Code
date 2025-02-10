package javaOops._4Inheritance;

 interface One1 {
 public void print_geek();
}

interface Two1 {
 public void print_for();
}

interface Three1 extends One1, Two1 {
 public void print_geek();
}
class Child implements Three1 {
 @Override public void print_geek()
 {
     System.out.println("Geeks");
 }

 public void print_for() { System.out.println("for"); }
}

//Drived class
public class Inheritance6_Multiple_Inheritance {
 public static void main(String[] args)
 {
     Child c = new Child();
     c.print_geek();
     c.print_for();
     c.print_geek();
 }
}