package Generic_method_NPTL;

public  class  Example_2_3{
	
	public 	 static <T> void swap(T x ,T y)
	{
		T temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swaping x:"+x+" y: "+y);
	}
	
	static <T> T print(T t) 
	{
		
		return t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Example_2_3 obj = null;
		int a=40;
		int b=90;
		
		System.out.println("before swapp x= "+a+" y:"+b);
		swap(a, b);
		
		System.out.println("the value of a="+print(a));

	}

}

