package javaOops._4Inheritance;

//Interface defining tax-related behavior (Multiple Inheritance via Interface)
interface Taxable {
 double calculateTax();
}

//Base Class (Parent Class)
class Employee1 {
 String name;
 double salary;

 // Constructor
 public Employee1(String name, double salary) {
     this.name = name;
     this.salary = salary;
 }

 // Method to display employee details
 void displayInfo() {
     System.out.println("Employee: " + name);
     System.out.println("Salary: $" + salary);
 }
}

//Manager Class (Multilevel Inheritance + Implements Interface)
class Manager extends Employee1 implements Taxable {
 double bonus;

 // Constructor
 public Manager(String name, double salary, double bonus) {
     super(name, salary);
     this.bonus = bonus;
 }

 // Overriding the displayInfo method to include bonus
 @Override
 void displayInfo() {
     super.displayInfo();
     System.out.println("Bonus: $" + bonus);
 }

 // Implementing the interface method
 @Override
 public double calculateTax() {
     return (salary + bonus) * 0.2;  // 20% tax on total earnings
 }
}

//Developer Class (Hierarchical Inheritance from Employee)
class Developer extends Employee1 {
 String programmingLanguage;

 // Constructor
 public Developer(String name, double salary, String programmingLanguage) {
     super(name, salary);
     this.programmingLanguage = programmingLanguage;
 }

 // Overriding the displayInfo method to include programming language
 @Override
 void displayInfo() {
     super.displayInfo();
     System.out.println("Programming Language: " + programmingLanguage);
 }
}

//Intern Class (Hierarchical Inheritance from Employee)
class Intern extends Employee1 {
 int internshipDuration;  // Duration in months

 // Constructor
 public Intern(String name, double salary, int internshipDuration) {
     super(name, salary);
     this.internshipDuration = internshipDuration;
 }

 // Overriding the displayInfo method to include internship duration
 @Override
 void displayInfo() {
     super.displayInfo();
     System.out.println("Internship Duration: " + internshipDuration + " months");
 }
}

//Main Class (Driver Class)EmployeeManagementSystem 
public class Inheritance7_Hybrid_Inheritance3 {
 public static void main(String[] args) {
     // Creating a Manager object (Multilevel + Interface)
     Manager manager = new Manager("Alice", 80000, 10000);
     manager.displayInfo();
     System.out.println("Tax to be paid: $" + manager.calculateTax());
     System.out.println("---------------------------------");

     // Creating a Developer object (Hierarchical Inheritance)
     Developer developer = new Developer("Bob", 70000, "Java");
     developer.displayInfo();
     System.out.println("---------------------------------");

     // Creating an Intern object (Hierarchical Inheritance)
     Intern intern = new Intern("Charlie", 20000, 6);
     intern.displayInfo();
 }
}
