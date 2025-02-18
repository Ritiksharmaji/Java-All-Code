package javaBasicPackage_3.Method;

public class Method3_MemoryLocation {
    private int num;
    private String n;

    // Accessor (getter) methods
    public int getNumber() { 
      return num; 
    }
    public String getName() { 
      return n; 
    }

    // Mutator (setter) methods
    public void setNumber(int num) { 
      this.num = num; 
    }
    public void setName(String n) { 
      this.n = n; 
    }

    // Other methods
    public void printDetails() {
        System.out.println("Number: " + num);
        System.out.println("Name: " + n);
    }

    // Main method to run the code
    public static void main(String[] args) {
    	Method3_MemoryLocation g = new Method3_MemoryLocation();
        g.setNumber(123);   // Set the number
        g.setName("GFG Write");   // Set the name
        g.printDetails();  
    }
}
