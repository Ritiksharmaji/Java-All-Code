package week7;
class person{
	int i=10,x=40;
	void display() {
		System.out.println("addition="+(i+x));
	}
	int display(int y) {
		//System.out.println("substration="+(i-x));
		return (i+x+y);
	}
}

public class methor_overloding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person obj=new person();
		obj.display();
		int a=obj.display(40);
		System.out.println("addition of three="+a);

	}

}
