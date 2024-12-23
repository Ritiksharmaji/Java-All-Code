package Generic_method_NPTL;
/*
 * Swapping the integer , dabble , float, String data types
 */
public class Example_2_3_1 {
	
	public static <T> void swapdata(T x, T y)
	{
		T a;
		a = x;
		x = y;
		y = a;
		System.out.println("value of a:"+x+" b:"+y);		
	}

	public static void main(String[] args) {
		// integer
		int a=30,b=50;
		System.out.println("before swapping:a:"+a+" b:"+b);
		swapdata(a,b);
		// float
		float a1=(float) 40.012;
		float b1=(float) 49.98;
		System.out.println("before swapping:a:"+a1+" b:"+b1);
		swapdata(a1,b1);
		// String
		String a2="Ritik";
		String b2="sharma";
		System.out.println("before swapping:a:"+a2+" b:"+b2);
		swapdata("ritik","sharma");
		

	}

}
