package week9;
class hello{
	void show()
	{
		System.out.println("riitk sharma");
	}
}
class a extends hello{
	void show()
	{
		System.out.println("ritik");
	}
}
class b extends hello{
	void show()
	{
		System.out.println("sharma");
	}
}

public class Run_timepolymorphisms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hello obj;
		obj=new a();
		obj.show();
		obj=new b();
		obj.show();

	}

}
