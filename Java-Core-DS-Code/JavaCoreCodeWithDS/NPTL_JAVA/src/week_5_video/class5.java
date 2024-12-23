package week_5_video;
interface calculate
{
	int VAR=0;
	void cal(int item);
}
class display implements calculate
{
	int x;
	public void cal(int item)
	{
		if(item<2)
		{
			x=VAR;
			
		}
		else
		{
			x=item*item;
		}
		
	}
}
public class class5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
display[] arr=new display[3];
for(int i=0;i<3;i++)

	arr[i]=new display();
	arr[0].cal(0);
	arr[1].cal(1);
	arr[2].cal(2);
	System.out.print(arr[0]+" "+arr[1].x+" "+arr[2].x);

	}

}
