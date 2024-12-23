package week_1_leacture02;

/*. A generic method or any method in a generic class can be declared as
static.
 * 
 */
class  generic_class <T>
{
	T obj;
	/*
	 * this is constructer
	 */
	generic_class(T obj)
	{
		this.obj=obj;
	}
	
	public <T> T method()
	{
		
		System.out.println("value store in contructer is:" + obj);
		return (T) obj;
		
	}
	/*
	 * this is normal contructer of generic clas
	 */
	
	public generic_class() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * this is generic static method 
	 */
	public static<T> void print(T obj)
	{
		System.out.println(obj);
	}
	/*
	 * this is normal static method
	 */
	
	public static void  person(String name, int age)
	{
		System.out.println("name:"+name+" age:"+age);
		
	}
}

public class Example_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// to call the normal static method		
		generic_class.person("Ritik sharma", 23);
		//calling the generic static method
		generic_class.print("student");
		generic_class.print(50);
		// create a generic class
		generic_class obj=new generic_class();
		generic_class obj1=new generic_class("ankit");
		
		obj.method();
		obj1.method();
		

	}

}
