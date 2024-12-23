package week_5_video;
class question
{
	int i;
	
}
class test extends question
{
	int j;
	void display()
	{
		super.i=j+1;
		System.out.println(j+" "+i);
	}
}
public class class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
test obj=new test();
obj.i=1;
obj.j=2;
obj.display();
	}

}
