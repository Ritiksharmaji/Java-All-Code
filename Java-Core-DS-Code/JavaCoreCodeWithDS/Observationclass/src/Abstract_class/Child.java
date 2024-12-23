package Abstract_class;
abstract class A
{
	abstract void display();
}
abstract class B extends A
{
	void display()
	{
		System.out.println("class A");
	}
	abstract void show();
}
class C extends B
{
	void show()
	{
		System.out.println("class B");
	}
}

public class Child {
	public static void main(String[] args)
	{
		C obj=new C();
		obj.show();
		obj.display();
	}

}
