package javaBasicPackage_3.Method;

//helper class
class Test2 {
    String n = "";

    // Instance method 
    public void test(String n) { 
      this.n = n; 
    }
}

// main class
class Method6_InstanceMethod {

public static void greet(){
 
 System.out.println("Hello Geek!");
}
 public static void main (String[] args) {
   
	// create an instance of the class
	 Test2 t = new Test2();

     // calling an instance method  in the class 'Geeks'
     t.test("GeeksforGeeks");
     System.out.println(t.n);
     
     // static method
     greet();
 }
}

