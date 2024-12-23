package GEneric;
 class myclasss <T>{ 
	 T obj;
	/*
	 * this constructor is <T> type of class
	 */
	myclasss  (T obj)
	{
		this.obj=obj;
	}
	/*
	 * this is another type of <T> method
	 */
	static <T> void add(T obj)
	{
		T t;
	//	this.obj=obj;  it showing error can't convert T(class) to T(method)
		t=obj;
	System.out.println("value in generic method:"+t);
	}
	T get()
	{
		return obj;
	}
	 
}
public class Generic_class_with_Generic_method {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  myclasss<Integer> obj=new myclasss<Integer>(50);		
		//obj.add("tikk");
		
        /*
		 * this obj can store any type but at time
		 * at a time only one type beacuse it is method of generic type
		 */        
        myclasss.add("ritik");
		myclasss.add(123);
		myclasss.add(98.098);
		
		System.out.println("value in generic class:"+obj.get());

	}

}
