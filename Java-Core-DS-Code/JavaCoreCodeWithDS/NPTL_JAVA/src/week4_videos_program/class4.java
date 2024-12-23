package week4_videos_program;
class baseclass
{
	public int x=10;
	private int y=10;
	protected int z=10;
	int a=10;
	public int getx()
	{
		return x;
	}
	public void setx(int x)
	{
		this.x=x;
	}
	private int gety()
	{
		return y;
	}
	private void sety(int y)
	{
		this.y=y;
	}
	protected int getz()
	{
		return z;
	}
	protected void setz(int z)
	{
		this.z=z;
	}
	int getA()
	{
		return a;
	}
	void setA(int a)
	{
		this.a=a;
	}
	
}
public class class4 extends baseclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baseclass obj=new baseclass();
		obj.z=0;
		
		class4 obj2=new class4();
		
		System.out.println("value of x is:"+obj2.x);
		
		obj2.setx(20);
		System.out.println("value of x is "+obj2.x);
		
		System.out.println("value of z is:"+obj2.z);
		
		obj2.setz(30);
		System.out.println("value of z:is ="+obj2.z);
		
		System.out.println("value of a:"+obj2.a);
		obj2.setA(20);
		System.out.println("value of x is:"+obj2.a);
		
	/*	 System.out.println("value of y:"+obj2.y);
		 obj2.sety(50);
		 System.out.println("value of y:"+obj2.y); */
		

	}

}
