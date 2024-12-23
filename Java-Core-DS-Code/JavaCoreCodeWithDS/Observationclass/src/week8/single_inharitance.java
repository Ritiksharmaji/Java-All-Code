package week8;
class person{
	int id=10;
	String s="ritik";
	String college="vfstr";
	void display() {
		System.out.println("name="+s+"id="+id+"college="+college);
	}
}
class boy extends person{
	int id=40;
	String s="gopi";
	void show() {
		System.out.println("id="+id+"name="+s+"collge name="+college);
	}
}

public class single_inharitance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boy obj=new boy();
		obj.display();
		obj.show();

	}

}
