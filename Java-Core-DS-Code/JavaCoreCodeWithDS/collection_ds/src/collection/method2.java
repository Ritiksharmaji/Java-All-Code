package collection;

public class method2 {
	
	static <T> void genericPrint(T t)
	{
		System.out.println(t.getClass().getName()+":"+t);
	}

	
	public static void main(String[] args)
	{
		genericPrint(100);
		genericPrint("ritik sharma");
		genericPrint(3.484);
		
	}
}
