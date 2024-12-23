package exception_handaling;

public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=2;
		int c=0;
		int array[]={1,2,3,4,5};
		String sc="ritik sharma";
		try {
			int x=a/c;
			System.out.println(array[7]);
			System.out.println(sc.charAt(5));
			
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
					}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		//System.out.println("devision="+c);
	//	System.out.println("array index value="+array[3]);
		
		finally {
			System.out.println("sting inex="+sc.charAt(3));
			System.out.println("array index value="+array[7]);
			System.out.println("devision="+c);

		}

	}

}
