package Generic_class;

///import GEneric.myclass;

/*
 * A generic method or any method in a generic class can be declared as
static
 */
 class person<T>{
	T temp;
	 void display( int x,int y)
	{
		int t;
		System.out.println("this is normal static method of generic classs");
		t=x;
		x=y;
		y=t;
		System.out.println("after swap x:"+x+" y:"+y);
	}
	static <T> void display(T x,T y) 
	{
		T t=x;
		x=y;
		y=t;
		
		System.out.println("after swap x:"+x+" y:"+y);
		
	}
}


public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//	person<T> obj=new person<T>();
		
	//	person<Integer> obj=new person<Integer>();
		
		
		
		

	}

	

}
