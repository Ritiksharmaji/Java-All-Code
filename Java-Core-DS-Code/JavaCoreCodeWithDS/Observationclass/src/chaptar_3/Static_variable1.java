package chaptar_3;
class A{
	static String s="vfstr";
	String name="riitk";
	int marks=39;
	void display()
	{
		System.out.println("name"+name+"college="+s+"marks"+marks);
	}
	
	
	
}
class B{
	String name="riitk";
	int marks=39;
	void display1()
	{
		System.out.println("name"+name+" college="+"a="+A.s+" marks"+marks);
	}
	
}

public class Static_variable1 {
	public static void main(String[] args) {
		A obj=new A();
		B obj1=new B();
		obj.display();
		obj1.display1();
		
	}

}
