package synchronize;
class bookthreadseat{
	int total_seats=10;
	synchronized  void bookseat(int seats)
	{
		if(total_seats>=seats)
		{
			System.out.println("seats booked succefully");
			total_seats=total_seats-seats;
			System.out.println("seats left="+total_seats);
			
		
		}
		else {
			System.out.println("seats not avalible");
			System.out.println("seats left="+total_seats);
			
		}
	}
}

 public class first_one extends Thread {
	static bookthreadseat b;
	int seats;
	public void run() 
	{
		b.bookseat(seats);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b=new bookthreadseat();
		first_one ritik =new first_one();
		ritik.seats=7;
		ritik.start();
		first_one sharma =new first_one();
		sharma.seats=6;
		sharma.start();

	}

}
