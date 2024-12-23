package synchronize;

class bookthreadseat1{
	int total_seats=10;
	 void bookseat(int seats)
	{
		
		System.out.println("this is"+Thread.currentThread().getName());
		System.out.println("this is"+Thread.currentThread().getName());
		System.out.println("this is"+Thread.currentThread().getName());
		System.out.println("this is"+Thread.currentThread().getName());
		synchronized(this)
		{
		if(total_seats>=seats)
		{
			System.out.println("seats booked succefully");
			total_seats=total_seats-seats;
			System.out.println("seats left="+total_seats);
		}
		else
		{
			System.out.println("seats not avalible");
			System.out.println("seats left="+total_seats);
			
		}
		}
		System.out.println("this is"+Thread.currentThread().getName());
		System.out.println("this is"+Thread.currentThread().getName());
		System.out.println("this is"+Thread.currentThread().getName());
	}
}

	

public class block_synchronize extends Thread{
	
	static bookthreadseat1 b;
	int seats;
	public void run() 
	{
		b.bookseat(seats);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b=new bookthreadseat1();
		block_synchronize ritik =new block_synchronize();
		ritik.seats=7;
		ritik.start();
		block_synchronize sharma =new block_synchronize();
		sharma.seats=6;
		sharma.start();

	}

}

