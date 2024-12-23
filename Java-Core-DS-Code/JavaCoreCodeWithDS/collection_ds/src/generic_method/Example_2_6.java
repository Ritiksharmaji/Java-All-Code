package generic_method;

class person{
	String name;
	float marks;
	person(String name,float marks)
	{
		this.marks=marks;
		this.name=name;
		
	}
}

public class Example_2_6 {
	
	public static void swap(Object x,Object y)
	{
		Object t;
		t=x;
		x=y;
		y=t;
		
		System.out.println("after swap value of object type: x="+x+" y="+y);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object p1=new person("ritik",50);
		Object p2=new person("golu",49);
		
		System.out.println("before swap p1="+p1+" p2="+p2);
		swap(p1,p2);

	}

}
