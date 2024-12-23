package Threadnote;
//package Threadnote;
class Boys extends Thread
{
	public void run()
	{
		System.out.println("priority of thread A="+getPriority());
				
	}
	
}
class BBBs extends Thread
{
	public void run()
	{
		System.out.println("priority of thread B="+getPriority());
		//System.out.println("\n B:\n thread  ID:\t "+Thread.currentThread().getId()+
			//	"\n Thread priority:\t"+Thread.currentThread().getPriority());
				
		
	}
}

public class Get_priority {
	public static void main(String[] args)
	{
		Boys aa=new Boys();
		BBBs bb=new BBBs();
		aa.setPriority(Thread.MIN_PRIORITY);
		bb.setPriority(Thread.MAX_PRIORITY);
	aa.start();
	bb.start();
	}

}
