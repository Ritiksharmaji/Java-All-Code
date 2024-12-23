package Threadnote;
class Demo extends Thread
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		System.out.println(getName()+" "+i);
	}
}
public class Threadclass {
	public static void main(String[] args) 
	{
		Demo obj=new Demo();
		Demo obj1=new Demo();
		Demo obj2=new Demo();
		obj.setPriority(Thread.MAX_PRIORITY);
		obj1.setPriority(Thread.MIN_PRIORITY);
		obj2.setPriority(Thread.NORM_PRIORITY);
		obj.start();
		obj1.start();
		obj2.start();
	}

}
