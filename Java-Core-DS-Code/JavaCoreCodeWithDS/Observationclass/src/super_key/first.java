package super_key;
class A{
	int x=10;
	void show()
	{
		System.out.println("x="+x);
	}
}


/* this is not working 
class B {
	int x=30;
	void display()
	{
		System.out.println("super variable="+super.x);
		System.out.println("x variable="+x);
		
	}
}                       */


class B  extends A{
	int x=30;
	void display()
	{
		System.out.println("super variable="+super.x);
		System.out.println("x variable="+x);
		
	}
}

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		obj.show();
		obj.display();
		

	}

}
