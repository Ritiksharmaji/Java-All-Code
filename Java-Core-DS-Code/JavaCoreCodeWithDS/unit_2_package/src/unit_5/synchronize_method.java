package unit_5;
class person{
	synchronized void method(char ch) {
		for(int i=0;i<3;i++)
		{
			System.out.println(ch);
		}
	}
}

public class synchronize_method extends Thread {
	person p;
	char ch;
	synchronize_method(char c)
	{
		ch=c;
	}
	 public void run() {
		 System.out.println("thread="+getName());
		 p.method(ch);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		synchronize_method obj=new synchronize_method('*');
		synchronize_method obj2=new synchronize_method('#');
		obj.start();
		obj2.start();

	}

}
