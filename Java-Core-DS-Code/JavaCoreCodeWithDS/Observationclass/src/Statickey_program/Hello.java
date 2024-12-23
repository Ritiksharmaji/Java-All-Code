package Statickey_program;
    class Person
{
	static int a=10;
	int b=20;
	static void display()
	{
		System.out.println("value of static a="+a);
	//	System.out.println("value of static b="+b);
	}
}

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Person obj=new Person();
		Person.display();

	}

}
