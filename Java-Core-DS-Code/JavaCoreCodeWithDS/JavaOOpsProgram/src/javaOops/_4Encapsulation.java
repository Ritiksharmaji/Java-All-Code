package javaOops;

//Encapsulation Example: Student Class
class Student {
 // Private variables (data hiding)
 private String name;
 private int age;

 // Constructor to initialize values
 public Student(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Getter method for name
 public String getName() {
     return name;
 }

 // Setter method for name
 public void setName(String name) {
     this.name = name;
 }

 // Getter method for age
 public int getAge() {
     return age;
 }

 // Setter method for age (with validation)
 public void setAge(int age) {
     if (age > 0) { // Validating age
         this.age = age;
     } else {
         System.out.println("Age must be positive!");
     }
 }
}


public class _4Encapsulation {
	
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
    }

}
