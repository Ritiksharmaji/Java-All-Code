package week_5_assigment_related;
interface A{
	int x=10;
	void m1();
}
class B implements A{
	int x=20;
	public void m1()
	{
		System.out.println("java");
	}
}
public class class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating object of interface
		A a=new B();
		a.m1();
		System.out.println(a.x);
		
		// creating object of class
		B b=new B();
		b.m1();
		System.out.println(b.x);

		

	}

}
