package GEneric;
/*
 * creating a generic lass
 */
class myclass <T>{
	T obj;
	void add(T obj)
	{
		this.obj=obj;
	
	}
	T get()
	{
		return obj;
	}
}
public class Class_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myclass<Integer> obj=new myclass<Integer>();
		
		obj.add(4);
		//obj.add("tikk");
		
		System.out.println(obj.get());

	}

}
