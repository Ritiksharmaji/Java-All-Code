package unit_2_package;
class person{
	int a,b;
	person(int x,int y)
	{
		a=x;
		b=y;
		
		System.out.println("addtion="+(a+b));
	}
	void person()
	{
		int a=20;
		int b=40;
		System.out.println("add="+(a+b));
	}
}

public class method_name_as_class_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person obj=new person(30,50);
		obj.person();

	}

}
