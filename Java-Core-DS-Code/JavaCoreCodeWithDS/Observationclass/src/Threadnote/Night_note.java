package Threadnote;
class Demo1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		System.out.println(getName()+" "+i);
	}
}
public class Night_note {
	public static void main(String[] args) 
	{
		Demo1 obj=new Demo1();
		Demo1 obj1=new Demo1();
		Demo1 obj2=new Demo1();
		obj.setPriority(Thread.MAX_PRIORITY);
		obj1.setPriority(Thread.MIN_PRIORITY);
		obj2.setPriority(Thread.NORM_PRIORITY);
		obj.start();
		obj1.start();
		obj2.start();
	}

}
