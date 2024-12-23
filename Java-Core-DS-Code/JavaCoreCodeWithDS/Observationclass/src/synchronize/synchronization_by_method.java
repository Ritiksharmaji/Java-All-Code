package synchronize;
class bookthreadseatt1{
	  int total_seats=20;
	  synchronized void bookseat(int seats)
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
 class first1 extends Thread {
	static bookthreadseatt1 b;
	int seats;
	 first1(bookthreadseatt1 b,int seats)
	{
		 
	this.b=b;
		this.seats=seats;
		
	}
	public void run() 
	{
		b.bookseat(seats);
		
	}
 }
  class second1 extends Thread {
		static bookthreadseatt1 b;
		int seats;
		second1(bookthreadseatt1 b,int seats)
		{
			this.b=b;
			this.seats=seats;
		}
		public void run() 
		{
			b.bookseat(seats);
		}
  }


public class synchronization_by_method {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			bookthreadseatt1	b=new bookthreadseatt1();
			first1 t1 =new first1(b,8);
			t1.start();
			second1 t2 =new second1(b,6);
			t2.start();
			bookthreadseatt1 b1=new bookthreadseatt1();
			first1 t3=new first1(b1,5);
			t3.start();
			second1 t4=new second1(b1,7);
			t4.start();
	}



}
