package exception_handaling;

public class throw_exception {
		public static void person(int age)
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
		person(13);

	}

}
