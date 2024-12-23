package exception_handaling;

class invalid_date extends Exception{
	
	invalid_date(String s)
	{
		super(s);
	}
	
}
public class userdifine_exception {
	public static void method(int age)throws invalid_date
	{
		if(age<18)
		{
		throw new invalid_date("not eligible");
		
	}
	else
	{
		System.out.println("eligible");
	}
}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			method(10);
		}
		catch(Exception e)
		{
			System.out.println("exception catched");
		}

	}

}
