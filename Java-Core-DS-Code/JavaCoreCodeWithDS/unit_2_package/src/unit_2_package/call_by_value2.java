package unit_2_package;
// not getting this ones.
class gils{
	void hi(int data)
	{
		int x=10;
		hi(x);
		System.out.println("value="+data);
	}
}

public class call_by_value2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gils obj=new gils();
		obj.hi(20);

	}

}
