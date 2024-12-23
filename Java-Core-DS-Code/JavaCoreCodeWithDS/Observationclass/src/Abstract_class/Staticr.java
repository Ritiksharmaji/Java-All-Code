package Abstract_class;
class static1 {
	static int c=0;
	void increment() 	{
	c++;
	}
	void display() 	{
	System.out.println("Value="+c);
	}
}


public class Staticr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		static1 s=new static1();
		static1 s1=new static1();
		static1 s2=new static1();
		s.increment();
		s1.increment();
		s2.increment();
		s.display();
		s1.display();
		s2.display();
		}


	}
