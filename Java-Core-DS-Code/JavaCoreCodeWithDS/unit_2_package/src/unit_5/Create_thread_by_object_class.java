package unit_5;

public class Create_thread_by_object_class extends Thread {
	 public void run()
	{
		System.out.println("hi boys welcome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Create_thread_by_object_class obj=new Create_thread_by_object_class();
		obj.start();
		

	}

}
