package collection_parameter;

public  class class_1 {
	
	public static void  swap(T t1,T t2)
	{
		T temp;
		
		temp=t2;
		t2=t1;
		t1=temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer x=new Integer(40);
		Integer y=new Integer(90);
		
		
		System.out.println("before swapping x:y:"+x+y);
		swap(x,y);
		


	}

}
