package week_1_leacture02;


class personn<T1, T2>{
	T1 obj1;
	T2 obj2;
	personn(T1 obj1,T2 obj2)
	{
		this.obj1=obj1;
		this.obj2=obj2;
		
	}
	
	public  void printValue()
	{
		System.out.println("value of first object="+"age:"+obj1+"name:"+obj2);
	}
	
	
}
public class Exmple_4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
personn<Integer, String> ob= new personn<Integer,String>(30,"ritik");
		
		personn<String,Float>ob2=new personn<String, Float>("Ankit",(float) 45.9);
		
		ob.printValue();
		ob2.printValue();

	}

}
