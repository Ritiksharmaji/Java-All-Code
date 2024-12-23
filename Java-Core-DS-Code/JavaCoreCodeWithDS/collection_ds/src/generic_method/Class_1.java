package generic_method;

public class Class_1 {
	
	 <T> void go(T t)
	{
		System.out.println(t);
	}
	 
	  <T> T print(T t )
	 {
		  
		 return t;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_1 obj =new Class_1();
		obj.go("ritik");
     System.out.println(obj.print(50));		
		

	}

}
