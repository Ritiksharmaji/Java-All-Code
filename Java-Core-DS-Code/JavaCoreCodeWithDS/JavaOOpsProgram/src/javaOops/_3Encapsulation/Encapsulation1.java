package javaOops._3Encapsulation;


//Encapsulated class
class Student {
 // Step 1: Private variables (data hiding)
 private String name;
 private int age;

 // Step 2: Constructor to initialize values
 public Student(String name, int age) {
     this.name = name;
     setAge(age); // Using setter for validation
 }

 // Step 3: Getter method for name
 public String getName() {
     return name;
 }

 // Step 4: Setter method for name
 public void setName(String name) {
     this.name = name;
 }

 // Step 3: Getter method for age
 public int getAge() {
     return age;
 }

 // Step 4: Setter method with validation
 public void setAge(int age) {
     if (age > 0) { // Validating age
         this.age = age;
     } else {
         System.out.println("Age must be positive!");
     }
 }
}

//Main Class
public class Encapsulation1 {
 public static void main(String[] args) {
     // Creating object using constructor
     Student student = new Student("John", 20);

     // Accessing private fields via getter
     System.out.println("Student Name: " + student.getName());
     System.out.println("Student Age: " + student.getAge());

     // Updating fields using setter
     student.setName("Alice");
     student.setAge(25);

     // Display updated values
     System.out.println("Updated Name: " + student.getName());
     System.out.println("Updated Age: " + student.getAge());

     // Attempt to set invalid age
     student.setAge(-5); // Shows validation error
 }
}
