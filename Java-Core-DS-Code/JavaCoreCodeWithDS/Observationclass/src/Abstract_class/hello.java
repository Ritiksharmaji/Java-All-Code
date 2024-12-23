package Abstract_class;
// to check abstract class and interface
interface AA{
	abstract void a();
	void b();
	void c();
	
}
 abstract class BB implements AA{
	public  void c()
	{
		System.out.println("i am c");
	}
}
class m extends BB{
	public void a()
	{
		System.out.println("i am a");
		
	}
	public void b()
	{
		System.out.println("i am b");
		
	}
	
	
}





public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AA aa=new m();
		m aa=new m();
		aa.a();
		aa.b();
		aa.c();

	}

}
