package week7;
class  boy{
	int x,y;
	String z;
	public boy(int a,int b) {
		x=a;
		y=b;
		System.out.println("addition="+(x+y));
		
	}
	public boy(int a,String b) {
		x=a;
		z=b;
		System.out.println("id="+x+" name="+z);
	}
}

public class constructor_overloding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boy obj=new boy( 10,30);
		boy obj1=new boy(40,"ritik");

	}

}
