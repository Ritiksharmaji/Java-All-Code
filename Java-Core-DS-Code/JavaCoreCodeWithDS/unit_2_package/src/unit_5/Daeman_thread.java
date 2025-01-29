package unit_5;

public class Daeman_thread extends Thread {
	public void run()
	{
		for(int i=0;i<2;i++)
		{
			System.out.println("name of thread="+getName()+" "+"i ="+i);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Daeman_thread obj=new Daeman_thread();
		Daeman_thread obj2=new Daeman_thread();
		Daeman_thread obj3=new Daeman_thread();
		
		obj.setDaemon(true);
		obj2.setName("user definde thrad");
		obj.setDaemon(true);
		obj.start();
		obj2.start();
		obj3.start();

	}

}
