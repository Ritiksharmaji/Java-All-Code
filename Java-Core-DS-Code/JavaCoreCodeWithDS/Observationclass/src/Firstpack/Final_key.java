package Firstpack;
class Hello{
	int a,c;
	final int b=50;
		void hi()
	{
		a=30;
		c=60;
		System.out.println("a="+a+"b="+b+"c="+c);
	}
	void bye()
	{
		a=90;
		c=40;
		System.out.println("a="+a+"b="+b+"c="+c);
	}

	
}

public class Final_key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Hello obj=new Hello();
		obj.hi();
		obj.bye();
	
			}

}
