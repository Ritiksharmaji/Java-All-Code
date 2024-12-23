package week2;
class circle{
	double x,y,r;
	public circle(double a,double b,double c)
	{
		x=a;
		y=b;
		r=c;
	}
	public circle(double c)
	{
		x=0.0;
		y=0.0;
		r=c;
	}
	public circle(circle c)
	{
		x=c.x;
	    y=c.y;
		r=c.r;
	}
	public circle()
	{
		x=0.0;
		y=0.0;
		r=1.0;
	}
	public double circlesum()
	{
		return 2*3.14*r;
	}
	public double area()
	{
		return (22/7)*r*r;
	}
	
}

public class class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
