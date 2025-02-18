package javaBasicPackage_6.Interface;

class AA {
 int a;

 void set_A(int x) { 
   a = x; 
 }
}

//Class B have access to all public and
//protected methods and data members of Class A
class Interface_10_Single_Inheritance extends AA {
 int b, product;
 
   void set_B(int x) { 
   b = x; 
 }

 void cal_Product(){
     product = a * b;
     System.out.println("Product = " + product);
 }
 
   public static void main(String[] args)
 {
	   Interface_10_Single_Inheritance b = new Interface_10_Single_Inheritance();
     b.set_A(5);
     b.set_B(5);
     b.cal_Product();
 }
}

