package Firstpack;
class Pa{
	void display()
	{
		System.out.println("parent");
	}
}
class Ch extends Pa{
	void display()
	{
		System.out.println("child");
	}
	void show()
	{
		super.display();
		display();
	}
}


public class Superkeywithmethod {

	public static void main(String[] args){
		// TODO Auto-generated constructor stub
		Ch c=new Ch();
		c.show();
	}

}
