package javaBasicPackage_6.Interface;

class AAA {
 int a;
 void set_A(int x) { 
   a = x; 
 }
}

//Child of Class A
class BB extends AAA {
 int b;
 void set_B(int x) { 
   b = x; 
 }
}

//Child of Class B but have access to
//methods of both classes, i.e., Class A and B
class Interface_10_Multilevel_Inheritance_2 extends BB {
 int c, product;
 void cal_Product()
 {
     product = a * b;
     System.out.println("Product = " + product);
 }
 public static void main(String[] args)
 {
	 Interface_10_Multilevel_Inheritance_2 c = 
			 new Interface_10_Multilevel_Inheritance_2();
       
       // Class C accesses methods of both class A and B
     c.set_A(5);
     c.set_B(5);
     c.cal_Product();
 }
}
