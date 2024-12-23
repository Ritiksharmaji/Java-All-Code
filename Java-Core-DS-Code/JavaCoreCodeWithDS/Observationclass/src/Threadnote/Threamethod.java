package Threadnote;
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			if(i==1) {
			//	yield();  HOW TO USE IT
			}
			System.out.println("from thread A:i="+i);
		}
		System.out.println("end of  threa A");
		
	}
	
}
class B extends Thread
{
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			System.out.println("from thread B:j="+j);
			if(j==3) {
				stop();
			}
		//	System.out.println("'n from thread A:i=",i);
		}
		System.out.println("end of  threa B");
		
		
	}
}
class C extends Thread
{
	public void run()
	{
		for(int k=1;k<=5;k++)
		{
			System.out.println("from thread C:k="+k);
			if(k==1)
				try
			{
				sleep(9000);
			}
			catch(Exception e){}
		}
		System.out.println("end of  threa c");
		
		
	}
	
	
}

public class Threamethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A thread1=new A();
		B thread2=new B();
		C thread3=new C();
		System.out.println("thread A is beging started");
		thread1.start();
		System.out.println("thread B is beging started");
		thread2.start();
		System.out.println("thread C is beging started");
		thread3.start();
		
		

	}

}
