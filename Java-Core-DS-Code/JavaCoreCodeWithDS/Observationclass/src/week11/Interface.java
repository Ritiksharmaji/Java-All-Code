package week11;
class A{
	int a=10;
	int b=20;
	void dispaly()
	{
		System.out.println("addition of two variable="+(a+b));
		
	}
}
class B extends A{
	int c=20;
	int d=30;
	void dispaly2()
	{
		System.out.println("addition of four variable="+(a+b+c+d));
		
	}
	
}
class C extends B{
	int e=20;
	int f=30;
	void dispaly3()
	{
		System.out.println("addition of six variable="+(a+b+c+d+e+f));
		
	}
	
}
class D extends C{
	int g=20;
	int h=30;
	void dispaly4()
	{
		System.out.println("addition of eight variable="+(a+b+c+d+g+h));
		
	}
	
}


public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D obj=new D();
		obj.dispaly();
		obj.dispaly2();
		obj.dispaly3();
		obj.dispaly4();
		
		

	}

}
