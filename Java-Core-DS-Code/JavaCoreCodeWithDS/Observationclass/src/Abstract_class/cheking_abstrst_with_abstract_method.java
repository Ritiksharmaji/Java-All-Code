package Abstract_class;
abstract class Bike{  
	  abstract void run();  
	}  
	class Honda4 extends Bike{  
	void run(){System.out.println("running safely");}   
	}  
	

public class cheking_abstrst_with_abstract_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda4 obj=new Honda4();
		obj.run(); 

	}

}
