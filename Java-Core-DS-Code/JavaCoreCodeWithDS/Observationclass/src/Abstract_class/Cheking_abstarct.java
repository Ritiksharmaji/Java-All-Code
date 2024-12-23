package Abstract_class;
abstract class Bikee{ 
	int i=10,b=40;
	//abstract int x=10;
	void display()
	{
		  System.out.println("running safely boy");
		
	}
	  abstract void run();//implimation of abstract method in abstract class 
	}  
	class Honda3 extends Bikee{  
	void run()
	{
		  System.out.println("running safely girl");
		
	}
	}  
	


public class Cheking_abstarct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda3 obj=new Honda3();
		obj.display();
		obj.run();

	}

}
