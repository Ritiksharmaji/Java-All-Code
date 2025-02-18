package javaBasicPackage_6.Interface;

interface intfAAA 
{
 void geekName();
}

interface intfBBB 
{
 void geekInstitute();
}

interface intfC extends intfAAA, intfBBB {
 void geekBranch();
}

class Interface_12 implements intfC 
{
 public void geekName() {
       System.out.println("Rohit"); 
 }

 public void geekInstitute() {
     System.out.println("JIIT");
 }

 public void geekBranch() { 
       System.out.println("CSE"); 
 }

 public static void main(String[] args)
 {
	 Interface_12 ob1 = new Interface_12();
     ob1.geekName();
     ob1.geekInstitute();
     ob1.geekBranch();
 }
}
