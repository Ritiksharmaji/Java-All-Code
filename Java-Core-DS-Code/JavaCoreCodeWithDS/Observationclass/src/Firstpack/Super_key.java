package Firstpack;
class Parent{
	int x=10;
	void show()
	{
		System.out.println("x="+x);
	}
}
class Child extends Parent{
	int x=20;
	void display()
	{
		System.out.println("x="+super.x);
		System.out.println("x="+x);
	}
}
public class Super_key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.show();
		c.display(); 

	}

}
