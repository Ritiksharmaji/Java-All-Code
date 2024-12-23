package week2;
 class circle1{
	
	double x,y,r;
	circle1(double a,double b,double c)
	{
		x=a; y=b; r=c;
	}
	circle1(double c)
	{
		x=0; y=0;r=c;
	}
	circle1(circle1 c)
	{
		x=c.x; y=c.y; r=c.r;
	}
	circle1()
	{
		x=0.0; y=0.0; r=1.0;
	}
	double circum()
	{
		return 2*3.14*r;
	}
	double area()
	{
		return(22/7)*r*r;
	}
}
public class Class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		circle1 c1=new circle1(3.0,4.0,5.0);
		circle1 c2=new circle1(5.0);
		circle1 c3=new circle1(c1);
		circle1 c4=new circle1();
		//
		System.out.println("circumference of circle 1:"+c1.circum());
		System.out.println("Area of circle 1:"+c1.area());

	}

}
