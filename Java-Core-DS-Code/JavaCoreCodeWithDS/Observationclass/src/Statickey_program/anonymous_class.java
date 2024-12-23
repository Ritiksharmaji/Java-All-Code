package Statickey_program;
abstract class hi{
	abstract void run();
	
}
public class anonymous_class extends hi  {
	public void run()
	{
		System.out.println("this is person");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		anonymous_class obj=new anonymous_class();
		obj.run();

	}

}
