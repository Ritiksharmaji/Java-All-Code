package week7;
class hello{
	int id;
	String s;
	
	public hello(int id,String s)
	{
		this.id=id;
		this.s=s;
	}
	void display()
	{
		System.out.println("id="+id+"name="+s);
	}
}

public class this_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello obj=new hello(50,"ritik");
		obj.display();

	}

}
