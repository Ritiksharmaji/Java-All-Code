package week9;
class helloo
{
	int x=10;
	void display()
	{
		System.out.println("addition="+x);
	}
}
class boy extends helloo
{
	int x=20;
	void show() {
	System.out.println("addition of super ="+super.x);
	System.out.println("addition="+x);
	}
}

public class super_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boy obj=new boy();
		obj.display();
		obj.show();

	}

}
