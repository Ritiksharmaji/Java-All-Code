package Threadnote;
class Printing{
	synchronized void print(char ch)
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	
}
class Hi extends Thread
{
	Printing p;
	Hi(Printing p)
	{
		this.p=p;
		
	}
	public void run()
	{
		p.print('a');
	}
	
}
class Bye extends Thread
{
	Printing p;
	Bye(Printing p)
	{
		this.p=p;
		
	}
	public void run()
	{
		p.print('*');
	}
	
}
public class Syncronize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printing aa=new Printing();
	//	Printing aa;
		Hi threadA=new Hi(aa);
		Bye threadB=new Bye(aa);
		threadA.start();
		threadB.start();
		

	}

}
