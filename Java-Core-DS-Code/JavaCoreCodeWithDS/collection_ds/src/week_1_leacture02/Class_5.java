package week_1_leacture02;

public class Class_5 {
	public static void go(Object ...objects )
	{
		for(Object o:objects)
		{
			System.out.print(" "+objects);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		go(1,"ritik sharma" ,4.5,true);
		go(34,33);
		go(23,43,34,545,34,"D");

	}

}
