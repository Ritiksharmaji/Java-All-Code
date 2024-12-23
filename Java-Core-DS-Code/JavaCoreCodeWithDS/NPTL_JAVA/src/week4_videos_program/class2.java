package week4_videos_program;
class A
{
	int i;
	private int j;
	void setij(int x,int y)
	{
		i=x;
		j=y;
	}
	private  void hi()
	{
		System.out.println("hii ji");
	}
}
class B extends A
{
	int total;
	void sum()
	{
		total=i+j;
		hi();
		// so private file is not accessible out side of
		// it class either they are extends or not.
	}
}
public class class2  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
