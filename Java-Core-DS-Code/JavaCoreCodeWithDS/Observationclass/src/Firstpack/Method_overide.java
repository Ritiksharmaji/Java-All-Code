package Firstpack;
class A{
	  void display()
	{
		System.out.println("this is parent statment");
	}
}
class B extends A{
	void displays()
	{
		System.out.println("this is child statment");
	}
}

public class Method_overide {
	public static void main(String args[])
	{
		B ob=new B();
		ob.display();
	}
	

}
