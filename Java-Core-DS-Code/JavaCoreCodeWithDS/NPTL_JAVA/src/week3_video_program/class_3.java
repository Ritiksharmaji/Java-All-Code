package week3_video_program;

public class class_3 {
	
	static int circlecount=0; // class variable
	int count=0;
	public double x,y,r; // instance variable
	public class_3(double x,double y, double r)
	{
		this.x=x;
		this.y=y; this.r=r;
		
	}
	public class_3(double r)
	{
		this(0.0,0.0,r);
		circlecount++;
		count++;
	}
	public class_3(class_3 c)
	{
		this(c.x,c.y,c.r);
		circlecount++;
		count++;
	}
	public class_3()
	{
		this(0.0,0.0,0.1);
		circlecount++;
		count++;
	}
	public double circumference()
	{
		return(2*3.14159*r);
		
	}
	public double area()
	{
		return(3.14159*r*r);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class_3 c1=new class_3();
		System.out.print("c1 # "+c1.circlecount);
		// by myselph
		System.out.println("c1 for non static  # "+c1.count);

		
		class_3 c2=new class_3(5.0);
		System.out.print("c2 # "+c2.circlecount);
		//by myselph
		System.out.println("c2 for non static # "+c2.count);

		
		class_3 c3=new class_3(c1);
		System.out.print("c3 # "+c3.circlecount);
		//by myselph
		System.out.println("c3  for non static # "+c3.count);

		
		System.out.println("c1# "+c1.circlecount+" "+"c2# "+c2.circlecount+" "+"c3# "+c3.circlecount);
		
		

	}

}
