
package Statickey_program;
 class person1{
	int a=10;
	static int  b=40;
	public static  void display()
	{
		System.out.println("valu of static b="+b);
	}
}
 class jio{
	 int c=40;
	 static int  d=20;
	 public static  void display()
		{
		 // here we are accessing data from another class without 
		 // extends it 
			System.out.println("valu of static b="+Person.a+"method of ");
			//int e=Person.display();
			Person.display();
		}
	 
 }

public class static_with_inharitance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
