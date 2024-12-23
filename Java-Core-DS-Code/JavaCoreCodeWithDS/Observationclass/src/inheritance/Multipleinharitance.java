package inheritance;

class AA{
	int a,b;
	void input()
	{
		a=1;
		b=2;
		
	}
	void add()
	{
		System.out.println("addtion of tow number="+(a+b));
		
	}
			
}
class BB extends AA{
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
class CC extends BB{
	int d=2;
	void multiple()
	{
		System.out.println("multiple of four number="+(a*b*c*d));
	}
}



public class Multipleinharitance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CC obj=new CC();
		obj.input();
		obj.add();
		obj.getdata();
		obj.display();
		obj.multiple();

		

	}

}
