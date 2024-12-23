package chaptar_3;
class hello{
	static int a=100;
	int b=50;
	static void display()
	{
		System.out.println("static vatiable="+a);
	//	System.out.println(" non-static vatiable="+b);
	}
}

public class static_method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hello.display();   // directlly call by using class name of method

	}

}
