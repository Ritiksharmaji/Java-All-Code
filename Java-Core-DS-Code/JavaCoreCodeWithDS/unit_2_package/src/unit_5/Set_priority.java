package unit_5;

public class Set_priority extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("thread_priority="+getPriority()+" "+"i="+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set_priority obj=new Set_priority();
		Set_priority obj2=new Set_priority();
		Set_priority obj3=new Set_priority();
		obj.setPriority(MAX_PRIORITY);
		obj2.setPriority(MIN_PRIORITY);
		obj3.setPriority(NORM_PRIORITY);
		obj.start();
		obj2.start();
		obj3.start();
		

	}

}
