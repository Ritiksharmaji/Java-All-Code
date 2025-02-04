package javaOops._2Abstraction;
//Define an interface named Shape
interface Shape {
 double calculateArea(); // Abstract method for calculating the area
                         
}

//Implement the interface in a class named Circle

class Circle implements Shape {
 private double r;    // radius

 // Constructor for Circle
 public Circle(double r) { 
   this.r = r; 
 }

 // Implementing the abstract method from the Shape interface 
 public double calculateArea()
 {
     return Math.PI * r * r;
 }
}

//Implement the interface in a class named Rectangle
class Rectangle implements Shape {
 private double length;
 private double width;

 // Constructor for Rectangle
 public Rectangle(double length, double width)
 {
     this.length = length;
     this.width = width;
 }

 // Implementing the abstract method from the Shape interface
 public double calculateArea() { 
   return length * width; 
 }
}


public class Abstraction3_Interface1 {
	
	public static void main(String[] args) {
		// Creating instances of Circle and Rectangle
        Circle c = new Circle(5.0);
        Rectangle rect = new Rectangle(4.0, 6.0);

        System.out.println("Area of Circle: "
                           + c.calculateArea());
        System.out.println("Area of Rectangle: "
                           + rect.calculateArea());
    }

}
