package unit_2_package;
class Test {
	int i,j;
	int a,b;
	Test(int i,int j)     {
	a=i;b=j;
	}
	void meth(Test x)   {
	x.b*=2;
	//x.a/=2;
	x.a=a*3;
	}  
}



public class call_by_referance {

	public static void main(String[] args)    {
		Test obj=new Test(4,5);
		System.out.println("Before calling a="+obj.a+" b="+obj.b);
		obj.meth(obj);
		System.out.println("After  calling a="+obj.a+" b="+obj.b);
		}

}
