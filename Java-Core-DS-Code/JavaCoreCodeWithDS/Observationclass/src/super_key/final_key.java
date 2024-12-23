package super_key;
 final class Aa{
	void display()
	{
		System.out.println("this is person");
		
		
	}
}
 class Ba extends Aa{
	 void show()
	 {
		 System.out.println("bye");
	 }
 }

public class final_key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ba obj=new Ba();
		obj.show();

	}

}
