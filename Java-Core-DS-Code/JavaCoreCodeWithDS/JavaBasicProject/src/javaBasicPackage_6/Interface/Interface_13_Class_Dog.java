package javaBasicPackage_6.Interface;

//Java program to demonstrate class functionality
class Interface_13_Class_Dog {

 private String n; // name
 private String b; // breed
 private int a;    // age
 private String c; // color

 // Constructor to initialize the object
 public Interface_13_Class_Dog(String n, String b, int a, String c) {
     this.n = n;
     this.b = b;
     this.a = a;
     this.c = c;
 }

 // Getter methods
 public String getN() { 
   return n; 
 }
 public String getB() { 
   return b; 
 }
 public int getA() { 
   return a; 
 }
 public String getC() { 
   return c; 
 }

 // Override toString() to provide a 
 // custom string representation
 @Override
 public String toString() {
     return "Name is: " + n + 
       "\nBreed, age, and color are: "
            + b + ", " + a + ", " + c + "";
 }

 // Main method
 public static void main(String[] args) {
	 Interface_13_Class_Dog d = 
			 new Interface_13_Class_Dog("Tuffy", "Papillon", 5, "White");
     System.out.println(d);
 }
}
