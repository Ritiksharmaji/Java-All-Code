package javaOops._5Polymorphism;
import java.io.*;

//Class 1
//Helper class
class Student {
 // Method 1
 public void StudentId(String name, int roll_no)
 {
     System.out.println("Name :" + name + " "
                        + "Roll-No :" + roll_no);
 }

 // Method 2
 public void StudentId(int roll_no, String name)
 {
     // Again printing name and id of person
     System.out.println("Roll-No :" + roll_no + " "
                        + "Name :" + name);
 }
}

//Class 2
//Main class
class Polymorphism2_methodOverloading4 {
 // Main function
 public static void main(String[] args)
 {
     // Creating object of above class
     Student obj = new Student();

     // Passing name and id
     // Note: Reversing order
     obj.StudentId("Spyd3r", 1);
     obj.StudentId(2, "Kamlesh");
 }
}