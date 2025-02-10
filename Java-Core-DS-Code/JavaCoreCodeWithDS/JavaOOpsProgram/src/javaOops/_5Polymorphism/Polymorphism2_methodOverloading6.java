package javaOops._5Polymorphism;
//Java program with overloaded main()
import java.io.*;

public class Polymorphism2_methodOverloading6 {
 // Normal main()
 public static void main(String[] args)
 {
     System.out.println("Hi Geek (from main)");
     Polymorphism2_methodOverloading6.main("Geek");
 }

 // Overloaded main methods
 public static void main(String arg1)
 {
     System.out.println("Hi, " + arg1);
     Polymorphism2_methodOverloading6.main("Dear Geek", "My Geek");
 }

 public static void main(String arg1, String arg2)
 {
     System.out.println("Hi, " + arg1 + ", " + arg2);
 }
}