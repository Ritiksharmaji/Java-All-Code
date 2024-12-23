package week_1_leacture02;

public class class_3 {
	
	public static <T> void swap(T a,T b)
	{
		T temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swap x:"+a+ "after swap y: "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer x=new Integer(40);
		Integer y=new Integer(50);
		System.out.println("before swap x:"+x+ "after swap y"+y); 
		
		swap(x,y);
		
		swap("ritik","sharma");
		 
		

	}

}
