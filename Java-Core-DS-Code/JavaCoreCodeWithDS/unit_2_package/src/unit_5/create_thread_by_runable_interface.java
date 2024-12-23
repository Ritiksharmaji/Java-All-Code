package unit_5;

public class create_thread_by_runable_interface implements Runnable {
	public void run()
	{
		System.out.println("this is from implements by runnable");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		create_thread_by_runable_interface obj=new create_thread_by_runable_interface();
		Thread t=new Thread(obj);
		t.start();
		

	}

}
