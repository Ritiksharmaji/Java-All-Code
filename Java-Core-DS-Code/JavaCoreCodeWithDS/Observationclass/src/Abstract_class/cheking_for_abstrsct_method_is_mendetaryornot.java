package Abstract_class;
abstract class Bikee1{ 
	void display()
	{
		  System.out.println("running safely boy");
		
	}
 /* abstract void run(); 
	  {
		  System.out.println("running safely");
		  }  */
	}  
	class Honda33 extends Bikee1{  
	void display1()
	{
		  System.out.println("running safely girl");
		
	}
	}  
	

public class cheking_for_abstrsct_method_is_mendetaryornot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda33 obj=new Honda33();
		obj.display();
		obj.display1();
		//obj.run();

	}

}
