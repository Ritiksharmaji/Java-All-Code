package Firstpack;
class Parentss{
	Parentss()
	{
		System.out.println("parent constructor");
	}
	
}
class Childd extends Parentss{
	Childd()
	{
		super();
		System.out.println("child  constructor");
		
	}
	
}

public class superkeywithconstructor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childd cc=new Childd();
		

	}

}
