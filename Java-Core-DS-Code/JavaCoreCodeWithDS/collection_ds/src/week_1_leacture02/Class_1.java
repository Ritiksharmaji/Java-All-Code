package week_1_leacture02;

public class Class_1 {
	
	 static void  swap(int x ,int y) {
		int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("after swap value of x:"+x +"value of Y:"+y);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class_1 obj=new Class_1();
		int x=40,y=50;
		System.out.println(" before swap value of x:"+x + "value of y:"+y);
		swap(x, y);
		
		
				

	}

}
