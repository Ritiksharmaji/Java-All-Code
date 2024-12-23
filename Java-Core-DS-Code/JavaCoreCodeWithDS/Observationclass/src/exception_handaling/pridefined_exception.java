package exception_handaling;

public class pridefined_exception {
	public static void person(int age)throws ArithmeticException
	{
		if(age<18)
		{
		throw new ArithmeticException("not eligible");
	}
	else {
		System.out.println("it is eligble");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			person(13);
		}
		catch(Exception e)
		{
			System.out.println("exception catched");
		}
		finally {
			System.out.println("rest man!!");
		}

	}

}
