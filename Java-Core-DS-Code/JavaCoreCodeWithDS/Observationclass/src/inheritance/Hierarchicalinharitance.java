package inheritance;
class Ankit{
	int a,b;
	void input()
	{
		a=10;
		b=20;
		System.out.println("addtion of two number="+(a+b));
	}
	
}
class Baby extends Ankit{
	int c=30;
	void add()
	{
		System.out.println("addtion of three number="+(a+b+c));
	}
}
class Child extends Ankit{
	int d=40;
	void multiple()
	{
		System.out.println("addtion of three number="+(a+b+d));
	}
}


public class Hierarchicalinharitance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baby obj=new Baby();
		Child obj1=new Child();
		obj.input();
		obj.add();
		obj1.input();
		obj1.multiple();

	}

}
