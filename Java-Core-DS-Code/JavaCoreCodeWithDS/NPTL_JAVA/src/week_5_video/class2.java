package week_5_video;
interface A
{
	int x=10;
	void m1();
}
class B implements A
{
	int x=20;
	public void m1()
	{
		System.out.println("java");
	}
}
public class class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a=new B();
a.m1();
System.out.println(a.x);
	}

}
