package exception_handaling;

public class third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=2;
		int c=0;
		int array[]={1,2,3,4,5};
		String sc="ritik sharma";
		try {
			int x=a/c;
			System.out.println(array[9]);
			System.out.println(sc.charAt(5));
			
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			//System.out.println("array index value="+array[3]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			//System.out.println("devision="+c);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		//System.out.println("devision="+c);
	//	System.out.println("array index value="+array[3]);
		System.out.println("sting inex="+sc.charAt(3));

	}

}
