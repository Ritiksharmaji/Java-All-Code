package Statickey_program;
class A
{
	static int a=10;
	int b=20;
	static  void display()
	{
		System.out.println("static a="+a);
	}
}
class B
{
	int c=20;
         void display2()
	{
        	
		 System.out.println("static a="+A.a);
		 System.out.println("non static c="+c);
	}
}  

public class Static_variable {

	public static void main(String[] args) {
		A.display();
		System.out.println("static a="+A.a);
		// TODO Auto-generated method stub
		B obj=new B();
		A obj2=new A();
		obj2.display();
		obj.display2(); 
		 
		

	}

}
