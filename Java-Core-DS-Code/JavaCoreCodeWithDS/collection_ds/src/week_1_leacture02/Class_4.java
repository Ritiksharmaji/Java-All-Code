package week_1_leacture02;

public class Class_4 {
	static void go(int ...v)
	{
		System.out.println("number of argument: "+v.length);
		
		for(int i:v)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		go(9);
		go(1,-2,-5,0,-5);
		go();

	}

}
