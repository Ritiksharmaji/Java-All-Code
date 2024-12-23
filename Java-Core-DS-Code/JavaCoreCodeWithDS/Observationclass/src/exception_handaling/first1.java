package exception_handaling;

public class first1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,k;
		a=10;
		b=39;
		c=0;
		k=2;
		try {
			
			int x=a/c;
			k=b/a;
			
			
		}
		catch(Exception e)
		{
			System.out.println("boshitt !!!");
		}
		System.out.println("rest");
		System.out.println("k="+k);
		

	}

}
