package week_1_leacture02;

public class Class_2 {
	
	static <T> void genericPrint(T t)
	{
		System.out.println(t.getClass().getName()+" "+t);
	}
	
	// 
	//static void nongeneric()

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		genericPrint(101);
		genericPrint("ritik sharma");
		genericPrint('a');
		genericPrint(4.099);

	}

}
