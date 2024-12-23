package Threadnote;
class AA extends Thread
{
	public void run()
	{
		System.out.println("thread a starting..");
		for(int i=1;i<=5;i++)
		{
			System.out.println("from thread A:i="+i);
			
		}
		System.out.println("thread a ended..");
	}
}
class BB extends Thread
{
	public void run()
	{
		System.out.println("thread b starting..");
		for(int j=1;j<=5;j++)
		{
			System.out.println("from thread B:j="+j);
			
		}
		System.out.println("thread b ended..");
	}
	
}
class CC extends Thread
{
	public void run()
	{
		System.out.println("thread c starting..");
		for(int k=1;k<=5;k++)
		{
			System.out.println("from thread C:k="+k);
			
		}
		System.out.println("thread c ended..");
	}
}

public class Setpriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA aa=new AA();
		BB bb=new BB();
		CC cc=new CC();
		cc.setPriority(Thread.MAX_PRIORITY);
		aa.setPriority(Thread.NORM_PRIORITY);
		//bb.setPriority(aa.setPriority()+1);
		aa.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Thread A is started");
		aa.start();
		System.out.println("Thread B is started");
		bb.start();
		System.out.println("Thread C is started");
		cc.start();
		

	}

}
