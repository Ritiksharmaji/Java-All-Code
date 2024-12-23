 package synchronize;
class total_earing extends Thread{
	int total=0;
	 synchronized public void run()
	{
		for(int i=0;i<=5;i++)
		{
			total=total+100;
			
		}
		//System.out.println("total"+total);
		this.notify();
	}
}

public class Interthread_communication {

	public static void main(String[] args)throws InterruptedException  {
		// TODO Auto-generated method stub
		total_earing t=new total_earing();
		t.start();
		synchronized (t)
		{
			t.wait();
		System.out.println("total earing="+t.total+"R.s");
		}

	}

}
