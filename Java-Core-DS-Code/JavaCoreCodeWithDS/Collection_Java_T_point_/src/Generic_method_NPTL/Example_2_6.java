package Generic_method_NPTL;
/*
 * Object type swapping...
 */

 class student{
	 String name;
	 float marks;
	 student(String name , float marks)
	 {
		 this.marks=marks;
		 this.name=name;
				 
	 }	
}
public class Example_2_6 {
	
	public static void swapobject(Object x,Object y)
	{
		Object z;
		z=x;
		x=y;
		y=z;
		System.out.println("AFTER swap values of name:"+x +" marks"+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object obj=new student("ritik",450);
		Object obj2 = new student("sharma",30);
		System.out.println("before swap value of object= obj1:"+obj+" obj2:"+obj2);
		swapobject(obj,obj2);
		/*
		 * here we are swapping the values of addresh of obj1 to obj2. 
		 * not the values of obj1 to obj2
		 */

	}

}
