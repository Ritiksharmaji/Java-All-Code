package synchronize;
class bookthreadseatt{
	static  int total_seats=20;
	  static synchronized void bookseat(int seats)
	{
		if(total_seats>=seats)
		{
			System.out.println(seats+"seats booked succefully");
			total_seats=total_seats-seats;
			System.out.println("seats left="+total_seats);
			
		
		}
		else {
			System.out.println("seats not avalible");
			System.out.println("seats left="+total_seats);
			
		}
	}
}
 class first extends Thread {
	static bookthreadseatt b;
	int seats;
	 first(bookthreadseatt b,int seats)
	{
		 
	this.b=b;
		this.seats=seats;
		
	}
	public void run() 
	{
		b.bookseat(seats);
		
	}
 }
  class second extends Thread {
		static bookthreadseatt b;
		int seats;
		second(bookthreadseatt b,int seats)
		{
			this.b=b;
			this.seats=seats;
		}
		public void run() 
		{
			b.bookseat(seats);
		}
  }

public class static_synchronize {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bookthreadseatt	b=new bookthreadseatt();
		first t1 =new first(b,8);
		t1.start();
		second t2 =new second(b,6);
		t2.start();
		bookthreadseatt b1=new bookthreadseatt();
		first t3=new first(b1,5);
		t3.start();
		second t4=new second(b1,7);
		t4.start();
}

}
