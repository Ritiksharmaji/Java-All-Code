package Threadnote;
class Boy extends Thread
{
	public void run()
	{
		System.out.println("\n A:\n thread  ID:\t "+Thread.currentThread().getId()+
				"\n Thread priority:\t"+Thread.currentThread().getPriority());
				
	}
	
}
class BBB extends Thread
{
	public void run()
	{
		System.out.println("\n B:\n thread  ID:\t "+Thread.currentThread().getId()+
				"\n Thread priority:\t"+Thread.currentThread().getPriority());
				
		
	}
}
public class Get_id_of_thread {
	public static void main(String[] args)
	{
		Boy aa=new Boy();
		BBB bb=new BBB();
		aa.setPriority(Thread.MIN_PRIORITY);
		aa.setPriority(Thread.MAX_PRIORITY);
	aa.start();
	bb.start();
	}

}
