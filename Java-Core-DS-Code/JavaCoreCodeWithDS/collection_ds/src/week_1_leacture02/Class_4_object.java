package week_1_leacture02;

class Person
{
	String name;
	float marks;
	Person(String name,float marks)
	{
		this.marks=marks;
		this.name=name;
	}
}
public class Class_4_object {
	
	public static  void swap(Object x,Object y)
	{
		Object t;
		t=x;
		x=y;
		y=t;
	}

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object p1=new Person("ritik",(float) 59.30);
		
		Object p2=new Person("golu",(float) 43.30);
		
		System.out.println("p1= "+p1+" "+"p2="+p2);
		swap(p1,p2);
		
		System.out.println(" after p1= "+p1+" "+"p2="+p2);
		

	}

}
