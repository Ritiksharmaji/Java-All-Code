package Generic_method_NPTL;

public class Example_2_3_2 {
	
	public static <T> void swapdata(T x, T y)
	{
		T a;
		a = x;
		x = y;
		y = a;
		System.out.println("After swapping value of a:"+x+" b:"+y);		
	}
	
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		
				//  float x5 = new float(12.98);     invalid class type
				//	int x5 = new int(30);            invalid class type
				//  double x3 = new double(40.895);  invalid class type
		
		Integer x1 =new Integer(20);
		Integer y1 =new Integer(40);
		System.out.println("before swapping value of X:"+ x1+" Y:"+y1);
		swapdata(x1,y1);
		
		String x2=new String("Ritik");
		String y2=new String("sharma");
		System.out.println("before swapping value of X:"+x2+ " Y:"+y2);
		swapdata(x2,y2);
		
		Double x3 = new Double(40.98);
		Double y3 = new Double(50.987);
		System.out.println("before swapping value of X:"+x3+ " Y:"+y3);
		swapdata(x3,y3);
		
		Float x4 = new Float(40.9);
		Float y4 = new Float(23.4532);
		System.out.println("before swapping value of X:"+x4 +" Y:"+y4);
		swapdata(x4,y4);
			
		
		
	}

}
