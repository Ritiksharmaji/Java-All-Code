package generic_method;

public class Class_2_satic_method {
	
	 <T> void go(T t)
		{
			System.out.println(t);
		}
		 
		  static <T> T print(T t )
		 {
			  
			 return t;
		 }

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Class_1 obj =new Class_1();
			obj.go("ritik");
	     System.out.println(print(50));		
			

		}

}
