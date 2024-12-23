package collection_parameter;

public class swap_string {
	public static void swap(T x,T y)
	{
		T temp;
		temp=x;
		x=y;
		y=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="55";
		String y="23";
		System.out.println("before swap string value:"+"x="+x+"y="+y);
		swap(x,y);
		System.out.println("after swap String value:"+"x="+x+"y="+y);

	}

}
