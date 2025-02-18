package javaBasicPackage_6.Interface;

interface intfAA
{
 void geekName();
}

interface intfBB extends intfAA 
{
 void geekInstitute();
}


class Interface_11 implements intfBB 
{

 @Override 
   public void geekName() {
     System.out.println("Rohit");
 }

 @Override 
   public void geekInstitute() {
     System.out.println("JIIT");
 }

 public static void main(String[] args)
 {
	 Interface_11 ob1 = new Interface_11();

     // calling the method implemented
     // within the class.
     ob1.geekName();
     ob1.geekInstitute();
 }
}
