package Generic_method_NPTL;

public class Example_2_1 {
										/* it is showing the error -------------------
										 * ------------------
									 
										 void geneticPrint(T t)
										{
											System.out.println(t);
										}
									
										public static void main(String[] args) {
											// TODO Auto-generated method stub
											Example_2_1 obj;
											obj.geneticPrint(101);
											obj.geneticPrint("ritik sharma");
											obj.geneticPrint(3.454);
										*/
	
	<T> void geneticPrint(T t)
	{
		System.out.println(t);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example_2_1 obj= new Example_2_1();
		obj.geneticPrint(101);
		obj.geneticPrint("ritik sharma");
		obj.geneticPrint(3.454);

}
}
