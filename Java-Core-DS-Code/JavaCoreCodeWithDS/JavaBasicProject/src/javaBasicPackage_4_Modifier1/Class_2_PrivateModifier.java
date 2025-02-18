package javaBasicPackage_4_Modifier1;

	// Class A
	 class A {
	     private void display() {
	         System.out.println("GeeksforGeeks");
	     }
	 }

	 class Class_2_PrivateModifier {
	     public static void main(String args[]) {
	         A obj = new A();
	       
	         // Trying to access private method
	         // of another class
	         obj.display();
	     }
	 }


