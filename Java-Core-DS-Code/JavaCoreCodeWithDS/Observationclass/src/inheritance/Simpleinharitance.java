package inheritance;
//import java.util.*;
class A{
	int a,b;
	void input()
	{
		a=1;
		b=2;
		System.out.println("addtion of tow number="+(a+b));
		
	}
			
}
class B extends A{
	int c;
	void getdata()
	{
		c=50;
		
	}
	void display()
	{
		System.out.println("addtion of three number="+(a+b+c));
		
	}
}


public class Simpleinharitance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		obj.input();
	//	obj.add();
		obj.getdata();
		obj.display();

	}

}
